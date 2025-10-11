//package devoir_N2
//
//import kotlinx.coroutines.*
//import kotlin.random.Random
//
//// -------------------------------------------------------
//// Classe Commande
//// -------------------------------------------------------
//data class Commande(
//    val id: Int,
//    val plats: List<String>,
//    val total: Double
//) {
//    fun afficherDetails() {
//        println("----- Commande #$id -----")
//        plats.forEachIndexed { index, plat ->
//            println("Plat ${index + 1} : $plat")
//        }
//        println("Total à payer : $total €\n")
//    }
//}
//
//// -------------------------------------------------------
//// Classe Serveur
//// -------------------------------------------------------
//class Serveur(val nom: String) {
//    private var prochainId = 1
//    private val commandes = mutableListOf<Commande>()
//
//    fun prendreCommande(plats: List<String>, prix: List<Double>): Commande {
//        val total = prix.sum()
//        val commande = Commande(prochainId++, plats, total)
//        commandes.add(commande)
//        println("Serveur $nom a pris la commande #${commande.id}")
//        return commande
//    }
//
//    fun afficherCommandes() {
//        if (commandes.isEmpty()) println("Aucune commande enregistree.")
//        else commandes.forEach { it.afficherDetails() }
//    }
//}
//
//// -------------------------------------------------------
//// Classe Cuisinier
//// -------------------------------------------------------
//class Cuisinier(val nom: String) {
//
//    suspend fun preparerPlat(plat: String): String {
//        val delai = Random.nextLong(500, 1500)
//        delay(delai)
//        return "$plat (prepare par $nom en ${delai}ms)"
//    }
//
//    suspend fun preparerCommande(commande: Commande): List<String> = coroutineScope {
//        val platsPrepares = commande.plats.map { plat ->
//            async { preparerPlat(plat) }
//        }
//        platsPrepares.awaitAll()
//    }
//}
//
//// -------------------------------------------------------
//// Classe Cuisine
//// -------------------------------------------------------
//class Cuisine(private val cuisiniers: List<Cuisinier>) {
//
//    suspend fun gererPreparationCommande(commande: Commande): List<String> = coroutineScope {
//        val taches = mutableListOf<Deferred<String>>()
//        commande.plats.forEachIndexed { index, plat ->
//            val cuisinier = cuisiniers[index % cuisiniers.size]
//            taches += async { cuisinier.preparerPlat(plat) }
//        }
//        val resultats = taches.awaitAll()
//        println("✅ Tous les plats de la commande #${commande.id} sont prêts !")
//        resultats
//    }
//}
//
//// -------------------------------------------------------
//// Classe Caisse
//// -------------------------------------------------------
//class Caisse {
//    private val paiements = mutableMapOf<Int, Deferred<Boolean>>()
//    private val scope = CoroutineScope(Dispatchers.Default)
//
//    fun traiterPaiementAsync(commande: Commande): Deferred<Boolean> {
//        val paiement = scope.async {
//            delay(1000L + Random.nextLong(0, 500))
//            if (Random.nextDouble() < 0.25) {
//                throw Exception("❌ Paiement refuse pour la commande ${commande.id}")
//            }
//            println("💳 Paiement accepte pour la commande ${commande.id}")
//            true
//        }
//        paiements[commande.id] = paiement
//        return paiement
//    }
//
//    fun annulerPaiement(commande: Commande) {
//        paiements[commande.id]?.cancel(CancellationException("Annule par le client"))
//        println("⚠️ Paiement annule pour la commande ${commande.id}")
//    }
//}
//
//// -------------------------------------------------------
//// Classe Restaurant
//// -------------------------------------------------------
//class Restaurant(
//    val serveurs: List<Serveur>,
//    val cuisine: Cuisine,
//    val caisse: Caisse
//) {
//    private val commandes = mutableListOf<Commande>()
//    private val scope = CoroutineScope(Dispatchers.Default)
//
//    fun prendreCommandeEtTraiter(serveur: Serveur, plats: List<String>, prix: List<Double>) {
//        val commande = serveur.prendreCommande(plats, prix)
//        commandes.add(commande)
//
//        scope.launch {
//            println("🍽️ Debut du traitement pour la commande #${commande.id}")
//            try {
//                val platsPrepares = cuisine.gererPreparationCommande(commande)
//                platsPrepares.forEach { println("  → $it") }
//
//                val paiement = caisse.traiterPaiementAsync(commande)
//                try {
//                    val resultat = paiement.await()
//                    if (resultat) println("✅ Commande #${commande.id} finalisee avec succès.")
//                } catch (e: CancellationException) {
//                    println("⚠️ Paiement annule pour la commande ${commande.id}")
//                } catch (e: Exception) {
//                    println("❌ Erreur lors du paiement : ${e.message}")
//                }
//            } catch (e: Exception) {
//                println("Erreur lors du traitement de la commande : ${e.message}")
//            }
//        }
//    }
//
//    fun afficherCommandesEnCours() {
//        println("\n📋 Commandes en cours ou terminees :")
//        if (commandes.isEmpty()) println("Aucune commande enregistree.")
//        else commandes.forEach { it.afficherDetails() }
//    }
//}
//
//// -------------------------------------------------------
//// Fonction main() - Simulation complète
//// -------------------------------------------------------
//fun main() = runBlocking {
//    println("===== Debut de la simulation du restaurant =====\n")
//
//    // Creation du personnel
//    val serveur = Serveur("Amine")
//    val cuisiniers = listOf(Cuisinier("Sofia"), Cuisinier("Karim"))
//    val cuisine = Cuisine(cuisiniers)
//    val caisse = Caisse()
//    val restaurant = Restaurant(listOf(serveur), cuisine, caisse)
//
//    // Trois commandes simulees
//    restaurant.prendreCommandeEtTraiter(
//        serveur,
//        listOf("Salade Cesar", "Tajine Poulet"),
//        listOf(6.0, 12.0)
//    )
//
//    restaurant.prendreCommandeEtTraiter(
//        serveur,
//        listOf("Couscous Royal", "The à la menthe"),
//        listOf(15.0, 3.0)
//    )
//
//    restaurant.prendreCommandeEtTraiter(
//        serveur,
//        listOf("Soupe Harira"),
//        listOf(5.5)
//    )
//
//    // Attente pour laisser les coroutines se terminer
//    delay(4000)
//
//    // Affichage final
//    restaurant.afficherCommandesEnCours()
//
//    println("\n===== Fin de la simulation =====")
//}
//
//
//
//
