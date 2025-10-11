package devoir_N2

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect

data class Produit(val id: Int, val nom: String, var quantite: Int) {
    fun afficherDetails() {
        println("Produit ID: $id | Nom: $nom | Quantite: $quantite")
    }
}

class Stock {
    private val produits = mutableMapOf<Int, Produit>()
    val flowStock = MutableSharedFlow<String>()

    fun ajouterProduit(produit: Produit) {
        produits[produit.id] = produit
        println("Produit ajoute : ${produit.nom}")
    }

    suspend fun ajouterQuantite(idProduit: Int, quantite: Int) {
        delay(300)
        produits[idProduit]?.let {
            it.quantite += quantite
            flowStock.emit("Ajout de $quantite unites à ${it.nom}")
        }
    }

    suspend fun retirerQuantite(idProduit: Int, quantite: Int) {
        delay(300)
        produits[idProduit]?.let {
            if (it.quantite >= quantite) {
                it.quantite -= quantite
                flowStock.emit("Retrait de $quantite unites de ${it.nom}")
            } else {
                println("Erreur : Stock insuffisant pour ${it.nom}")
            }
        }
    }

    fun afficherStock() {
        println("--- etat actuel du stock ---")
        produits.values.forEach { it.afficherDetails() }
    }

    fun getProduit(id: Int) = produits[id]
}

data class Commande(val idCommande: Int, val produits: List<Pair<Int, Int>>) {
    fun afficherCommande() {
        println("Commande #$idCommande")
        produits.forEach { (idProduit, quantite) ->
            println(" - Produit ID: $idProduit | Quantite demandee: $quantite")
        }
    }
}

class GestionnaireCommandes(private val stock: Stock) {
    private val commandes = mutableListOf<Commande>()

    suspend fun traiterCommande(commande: Commande) = coroutineScope {
        commandes.add(commande)
        println("Traitement de la commande #${commande.idCommande}...")
        for ((idProduit, quantite) in commande.produits) {
            stock.retirerQuantite(idProduit, quantite)
        }
    }

    suspend fun gererCommandes(commandesList: List<Commande>) = coroutineScope {
        for (commande in commandesList) {
            traiterCommande(commande)
        }
    }
}

class Entrepot {
    val stock = Stock()
    val gestionnaireCommandes = GestionnaireCommandes(stock)

    suspend fun ajouterProduitAuStock(produit: Produit) {
        stock.ajouterProduit(produit)
    }

    suspend fun retirerProduitDuStock(idProduit: Int, quantite: Int) {
        stock.retirerQuantite(idProduit, quantite)
    }

    suspend fun gererInventaire() {
        stock.afficherStock()
    }

    suspend fun observerMisesAJourStock() = coroutineScope {
        launch {
            stock.flowStock.collect { event ->
                println("Mise à jour du stock : $event")
            }
        }
    }
}

fun main() = runBlocking {
    val entrepot = Entrepot()
    launch { entrepot.observerMisesAJourStock() }

    entrepot.ajouterProduitAuStock(Produit(1, "Clavier", 20))
    entrepot.ajouterProduitAuStock(Produit(2, "Souris", 35))
    entrepot.ajouterProduitAuStock(Produit(3, "ecran", 15))
    delay(500)

    entrepot.stock.ajouterQuantite(1, 10)
    entrepot.stock.retirerQuantite(2, 5)
    delay(500)

    val commandes = listOf(
        Commande(101, listOf(1 to 5, 2 to 3)),
        Commande(102, listOf(3 to 2))
    )
    entrepot.gestionnaireCommandes.gererCommandes(commandes)
    delay(1000)

    entrepot.gererInventaire()
}


