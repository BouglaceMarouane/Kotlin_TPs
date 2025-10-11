//package devoir_N1
//
//open class Personne(val nom: String, val prenom: String, val email: String) {
//    open fun afficherInfos() {
//        println("Nom : $nom")
//        println("Prenom : $prenom")
//        println("Email : $email")
//    }
//}
//
//class Utilisateur(nom: String, prenom: String, email: String, val idUtilisateur: Int
//) : Personne(nom, prenom, email) {
//    val emprunts: MutableList<Emprunt> = mutableListOf()
//
//    fun emprunterLivre(livre: Livre, dateEmprunt: String) {
//        if (livre.disponiblePourEmprunt()) {
//            val emprunt = Emprunt(this, livre, dateEmprunt, null)
//            emprunts.add(emprunt)
//            livre.mettreAJourStock(livre.nombreExemplaires - 1)
//        }
//    }
//
//    fun afficherEmprunts() {
//        if (emprunts.isEmpty()) {
//            println("$prenom $nom n'a aucun emprunt.")
//        } else {
//            emprunts.forEach { it.afficherDetails() }
//        }
//    }
//
//    override fun afficherInfos() {
//        super.afficherInfos()
//        println("ID Utilisateur : $idUtilisateur")
//    }
//}
//
//class Livre(
//    val titre: String,
//    val auteur: String,
//    val isbn: String,
//    var nombreExemplaires: Int
//) {
//    fun afficherDetails() {
//        println("Titre : $titre")
//        println("Auteur : $auteur")
//        println("ISBN : $isbn")
//        println("Nombre d'exemplaires : $nombreExemplaires")
//    }
//
//    fun disponiblePourEmprunt(): Boolean = nombreExemplaires > 0
//
//    fun mettreAJourStock(nouveauStock: Int) {
//        nombreExemplaires = nouveauStock
//    }
//}
//
//class Emprunt(
//    val utilisateur: Utilisateur,
//    val livre: Livre,
//    val dateEmprunt: String,
//    var dateRetour: String?
//) {
//    fun afficherDetails() {
//        println("Emprunt : ${livre.titre} par ${utilisateur.prenom} ${utilisateur.nom}")
//        println("Date emprunt : $dateEmprunt")
//        println("Date retour : ${dateRetour ?: "Non retourne"}")
//    }
//
//    fun retournerLivre(dateRetour: String) {
//        this.dateRetour = dateRetour
//        livre.mettreAJourStock(livre.nombreExemplaires + 1)
//    }
//}
//
//abstract class GestionBibliotheque {
//    val utilisateurs: MutableList<Utilisateur> = mutableListOf()
//    val livres: MutableList<Livre> = mutableListOf()
//
//    abstract fun ajouterUtilisateur(utilisateur: Utilisateur)
//    abstract fun ajouterLivre(livre: Livre)
//    abstract fun afficherTousLesLivres()
//}
//
//class Bibliotheque : GestionBibliotheque() {
//    override fun ajouterUtilisateur(utilisateur: Utilisateur) {
//        utilisateurs.add(utilisateur)
//    }
//
//    override fun ajouterLivre(livre: Livre) {
//        livres.add(livre)
//    }
//
//    override fun afficherTousLesLivres() {
//        livres.forEach { it.afficherDetails() }
//    }
//
//    fun rechercherLivreParTitre(titre: String): Livre? {
//        return livres.find { it.titre.equals(titre, ignoreCase = true) }
//    }
//}
//
//fun main() {
//
//    val livre1 = Livre("1984", "George Orwell", "1234567890", 3)
//    val livre2 = Livre("Le Petit Prince", "Antoine de Saint-Exupery", "0987654321"
//        , 2)
//    val livre3 = Livre("Kotlin pour les pros", "Jean Dupont", "1122334455", 1)
//
//    val user1 = Utilisateur("Dupont", "Alice", "alice@example.com", 1)
//    val user2 = Utilisateur("Martin", "Bob", "bob@example.com", 2)
//
//    val biblio = Bibliotheque()
//
//    biblio.ajouterLivre(livre1)
//    biblio.ajouterLivre(livre2)
//    biblio.ajouterLivre(livre3)
//
//    biblio.ajouterUtilisateur(user1)
////    biblio.ajouterUtilisateur(user2)
//
//    user1.emprunterLivre(livre1, "2025-09-30")
//    user1.emprunterLivre(livre2, "2025-09-30")
//    user2.emprunterLivre(livre1, "2025-10-01")
//
////    biblio.afficherTousLesLivres()
//    user1.afficherInfos()
//    user1.afficherEmprunts()
//
////    user2.afficherInfos()
////    user2.afficherEmprunts()
//
//    val empruntARetourner = user1.emprunts.firstOrNull { it.livre.titre == "1984" }
//    empruntARetourner?.retournerLivre("2025-10-05")
//
//    user1.afficherEmprunts()
////    biblio.afficherTousLesLivres()
//}
