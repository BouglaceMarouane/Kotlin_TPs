//package tp8
//
//enum class TypeVehicule {
//    VOITURE,
//    MOTO,
//    BATEAU;
//
//    fun message(): String {
//        return when (this) {
//            VOITURE -> "C'est une voiture."
//            MOTO -> "C'est un moto."
//            BATEAU -> "C'est un bateau."
//        }
//    }
//}
//
//interface Navigable {
//    fun naviguer() : String {
//        return "les vehicules capables de naviguer."
//    }
//}
//interface Volant {
//    fun voler() : String {
//        return "les vehicules capables de voler."
//    }
//}
//
//sealed class Vehicule(open var nom : String, open var marque : String, open var type : String) {}
//
//data class Voiture(override var nom : String, override var marque : String,
//override var type : String = "Rouler") : Vehicule(nom, marque, type), Volant {
//
//    override fun voler(): String {
//        return "Vehicule est en vol."
//    }
//}
//
//data class Bateau(override var nom : String, override var marque : String,
//override var type : String = "Naviguer") : Vehicule(nom, marque, type), Navigable {
//
//    override fun naviguer(): String {
//        return "Vehicule est en navigation."
//    }
//}
//
//
//data class Moto(override var nom : String, override var marque : String,
//override var type : String = "Rouler") : Vehicule(nom, marque, type) {}
//
//
//
//
//
//
//fun afficherInformationsVehicule(vehicules: MutableList<Vehicule>) {
//
//    vehicules.forEach {
//        println("${it.nom} - ${it.marque} - ${it.type}")
//    }
//
//}
//
//fun ajouterVehicule(vehicules: MutableList<Vehicule>, vehicule: Vehicule) {
//    vehicules.add(vehicule)
//}
//
//fun main() {
//
//    val voiture = Voiture("Mercedes-Benz", "Classe C")
//    val moto = Moto("Kawasaki", "Ninja ZX-10R")
//    val bateau = Bateau("Lagoon", "Lagoon 42")
//
//    val vehicules = mutableListOf<Vehicule>(voiture, moto, bateau)
//
//    val voiture1 = Voiture("BMW", "M4")
//    ajouterVehicule(vehicules, voiture1)
//
//    println(voiture.voler())
//    println(bateau.naviguer())
//
//    afficherInformationsVehicule(vehicules)
//}
//
//
//
//
