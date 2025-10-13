//fun main() {
//
//    val cercle = Cercle("red", 6)
//    val rectangle = Rectangle("green", 3, 5)
//
//
//    cercle.afficherInfo()
//    rectangle.afficherInfo()
//
//}
//
//
//open class Forme(var couleur: String) {
//
//    open fun afficherInfo() {
//        println("Couleur : $couleur")
//        println("--------------------------")
//    }
//}
//
//class Cercle(couleur : String ,var rayon: Int) : Forme(couleur) {
//    override fun afficherInfo() {
//        super.afficherInfo()
//        println("Rayon : $rayon")
//        println("--------------------------")
//    }
//}
//
//class Rectangle(couleur: String, val hauteur: Int, val largeur: Int) : Forme(couleur) {
//    override fun afficherInfo() {
//        super.afficherInfo()
//        println("Hauteur : $hauteur")
//        println("Largeur : $largeur")
//        println("--------------------------")
//    }
//}
