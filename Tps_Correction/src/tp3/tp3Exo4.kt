//package TP2
//
//import kotlin.math.PI
//import kotlin.math.pow
//
//fun main() {
//
//    val carre = Carre("carre", 5.0)
//    carre.cote = 5.0
//    val rectangle = Rectangle(5.0, 3.0)
//    val cercle = Cercle(2.5)
//
//    carre.afficher_details()
//    rectangle.afficher_details()
//    cercle.afficher_details()
//
//}
//
//
//open class Forme(val nom: String) {
//    open fun surface(): Double {
//        return 0.0
//    }
//
//    open fun perimetre(): Double {
//        return 0.0
//    }
//
//    open fun afficher_details() {
//        println("Forme : $nom")
//        println("Surface : ${surface()}")
//        println("Périmètre : ${perimetre()}")
//        println("--------------------------")
//    }
//}
//
//class Carre(nom : String ,var cote: Double) : Forme(nom) {
//    override fun surface(): Double = cote.pow(2)
//    override fun perimetre(): Double = 4 * cote
//}
//
//class Rectangle(private val longueur: Double, val largeur: Double) : Forme("Rectangle") {
//    override fun surface(): Double = longueur * largeur
//    override fun perimetre(): Double = 2 * (longueur + largeur)
//}
//
//class Cercle(private val rayon: Double) : Forme("Cercle") {
//    override fun surface(): Double = PI * rayon.pow(2)
//    override fun perimetre(): Double = 2 * PI * rayon
//}
//
//
//
//
//
//
//
////Kotlin avec abstract class
//
////import kotlin.math.PI
////import kotlin.math.pow
////
////// Classe abstraite
////abstract class Forme(val nom: String) {
////    abstract fun surface(): Double
////    abstract fun perimetre(): Double
////
////    open fun afficher_details() {
////        println("Forme : $nom")
////        println("Surface : ${surface()}")
////        println("Périmètre : ${perimetre()}")
////        println("--------------------------")
////    }
////}
////
////// Classe Carré
////class Carre(private val cote: Double) : Forme("Carré") {
////    override fun surface(): Double = cote.pow(2)
////    override fun perimetre(): Double = 4 * cote
////}
////
////// Classe Rectangle
////class Rectangle(private val longueur: Double, private val largeur: Double) : Forme("Rectangle") {
////    override fun surface(): Double = longueur * largeur
////    override fun perimetre(): Double = 2 * (longueur + largeur)
////}
////
////// Classe Cercle
////class Cercle(private val rayon: Double) : Forme("Cercle") {
////    override fun surface(): Double = PI * rayon.pow(2)
////    override fun perimetre(): Double = 2 * PI * rayon
////}
////
////// Programme principal
////fun main() {
////    val formes: List<Forme> = listOf(
////        Carre(5.0),
////        Rectangle(6.0, 3.0),
////        Cercle(4.0)
////    )
////
////    for (forme in formes) {
////        forme.afficher_details()
////    }
////}