//package TP2
//
//fun main() {
//    val personne = Personne()
//    personne.affiche()
//
//    personne.UpdateNom()
//    personne.UpdatePrenom()
//    personne.UpdateAge()
//    personne.UpdateAdresse()
//
//    println("Apres modification:")
//    personne.affiche()
//}
//
//
//class Personne {
//    var nom: String = "Bouglace"
//    var prénom: String = "Marouane"
//    var adresse: String = "IMM 157 GRP 23 APPT 19"
//    var âge: Int = 19
//
//    fun UpdateNom() {
//        print("Votre nom: ")
//        nom = readLine()!!
//    }
//
//    fun UpdatePrenom() {
//        print("Votre prenom: ")
//        prénom = readLine()!!
//    }
//
//    fun UpdateAge() {
//        print("Votre Age: ")
//        âge = readLine()!!.toInt()
//    }
//
//    fun UpdateAdresse() {
//        print("Votre Adresse: ")
//        adresse = readLine()!!
//    }
//
//    fun affiche() {
//        println("Nom: $nom, Prénom: $prénom, âge: $âge, Adresse: $adresse")
//    }
//
//}
