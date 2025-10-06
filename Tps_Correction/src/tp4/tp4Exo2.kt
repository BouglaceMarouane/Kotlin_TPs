//fun main() {
//
//    val oiseau = Oiseau("bijou")
//    val chien = Chien("german dog")
//
//
//    oiseau.parler()
//    oiseau.nom = ""
//    chien.parler()
//
//}
//
//
//interface Animal {
//    var nom: String
//
//    fun parler() {}
//    fun seDéplacer(){}
//}
//
//interface Volant {
//    var nom: String
//
//    fun voler() {}
//}
//
//
//
//class Oiseau (var genre : String) : Animal, Volant{
//    override fun seDéplacer() {
//        println("Genre : $genre")
//        println("--------------------------")
//    }
//
//    override var nom: String
//        get() = nom
//        set(value) {
//            nom = value
//        }
//
//    override fun parler() {
//        println("L'oiseau chante")
//    }
//    override fun voler() {
//
//    }
//}
//
//class Chien (var genre : String) : Animal{
//    override fun seDéplacer() {
//        println("Genre : $genre")
//    }
//    override fun parler() {
//        println("Le chien aboie.")
//    }
//
//    override var nom: String
//        get() = nom
//        set(value) {
//            nom = value
//        }
//
//}
//
//class Poisson (var genre : String) : Animal{
//    override fun seDéplacer() {
//        println("Genre : $genre")
//    }
//    override fun parler() {
//        println("Le poisson ne fait pas de bruit.")
//    }
//
//    override var nom: String
//        get() = nom
//        set(value) {
//            nom = value
//        }
//
//}
//
