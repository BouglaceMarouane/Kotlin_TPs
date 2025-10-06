//package TP2
//
//import Forme
//
//fun main() {
//    val personne = Personne("Bouglace")
//    val eleve = Eleve("zagnouni", 25, "Licence")
//    val employe = Employe("ziyad", 19, "Ingénieur")
//
//
//
//    personne.afficherDetails()
//    eleve.afficherDetails()
//    employe.afficherDetails()
//}
//
//
//open class Personne(var nom: String, var âge: Int = 24) {
//
//    open fun afficherDetails() {
//        println("Nom: $nom, âge: $âge")
//    }
//}
//
//class Eleve(nom: String, âge: Int, var niveau: String) : Personne(nom, âge) {
//    override fun afficherDetails() {
//        super.afficherDetails()
//        println("Niveau : $niveau")
//        println("--------------------------")
//    }
//}
//class Employe(nom: String, âge: Int, var poste: String) : Personne(nom, âge) {
//    override fun afficherDetails() {
//        super.afficherDetails()
//        println("Poste : $poste")
//        println("--------------------------")
//    }
//}
