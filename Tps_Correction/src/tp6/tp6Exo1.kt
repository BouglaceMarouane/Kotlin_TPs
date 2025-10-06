//fun main() {
//
//    val voiture = Voiture("G-class", 4, "BMW")
//    val camion = Camion("green", 3000, "volvo")
//
//
//    voiture.start()
//    voiture.stop()
//    camion.start()
//    camion.stop()
//
//}
//
//
//interface Vehicle {
//    var marque : String
//
//    fun start() {}
//    fun stop() {}
//}
//
//open class VehiculeBase (var nom : String, override var marque: String): Vehicle{
//    open fun afficher() {
//        println("Nom : $nom")
//        println("--------------------------")
//    }
//}
//
//class Voiture(nom: String, var nombrePortes : Int, marque: String) : VehiculeBase(nom, marque) {
//    override fun start() {
//        println("Nom : $nom")
//        println("--------------------------")
//    }
//    override fun stop() {
//        println("Marque : $marque")
//        println("--------------------------")
//    }
//
//    fun klaxonner() {
//        println("Nombre Portes : $nombrePortes")
//    }
//
//    override fun afficher() {
//        super.afficher()
//        println("Nom : $nom")
//        println("--------------------------")
//    }
//
//
//}
//
//class Camion(nom: String, var capaciteChargement : Int, marque: String) : VehiculeBase(nom, marque) {
//    override fun start() {
//        println("Couleur : $capaciteChargement")
//        println("--------------------------")
//    }
//    override fun stop() {
//        println("Couleur : $capaciteChargement")
//        println("--------------------------")
//    }
//
//    fun charger() {
//        println("Capacite Chargement : $capaciteChargement")
//    }
//
//}
