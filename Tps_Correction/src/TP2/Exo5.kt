package TP2

open class Vehicule(val marque: String, val modele: String) {

   open fun afficher_details() {
       println("Marque : $marque, Modèle : $modele")
   }

   open fun se_deplacer() {
       println("Véhicule se déplace...")
   }
}

class Avion(marque: String, modele: String, val ailes: Int, val nbrRoues: Int) : Vehicule(marque, modele) {
   override fun afficher_details() {
       super.afficher_details()
       println("Ailes : $ailes, Nombre de roues : $nbrRoues")
   }

   override fun se_deplacer() {
       println("L'avion se déplace en volant")
   }
}

class Voiture(marque: String, modele: String, val annee: Int, val nbrRoues: Int) : Vehicule(marque, modele) {
   override fun afficher_details() {
       super.afficher_details()
       println("Annee : $annee, Nombre de roues : $nbrRoues")
   }

   override fun se_deplacer() {
       println("La voiture se déplace en roulant")
   }
}

class Velo(marque: String, modele: String, val nbrRoues: Int) : Vehicule(marque, modele) {
   override fun afficher_details() {
       super.afficher_details()
       println("Nombre de roues : $nbrRoues")
   }

   override fun se_deplacer() {
       println("Le vélo se déplace en pedalant")
   }
}

fun main() {

   val avion1 = Avion("Boeing", "747", 2, 6)
   val avion2 = Avion("Airbus", "A320", 2, 6)

   val voiture1 = Voiture("Toyota", "Corolla", 2020, 4)
   val voiture2 = Voiture("BMW", "X5", 2022, 4)

   val velo1 = Velo("Decathlon", "Rockrider", 2)
   val velo2 = Velo("Giant", "Escape", 2)

   val avions: List<Avion> = listOf(avion1, avion2)
   val voitures: List<Voiture> = listOf(voiture1, voiture2)
   val velos: List<Velo> = listOf(velo1, velo2)

   println("=== Liste des Avions ===")
   for (a in avions) {
       a.afficher_details()
       a.se_deplacer()
       println("----------------------")
   }

   println("=== Liste des Voitures ===")
   for (v in voitures) {
       v.afficher_details()
       v.se_deplacer()
       println("----------------------")
   }

   println("=== Liste des Velos ===")
   for (v in velos) {
       v.afficher_details()
       v.se_deplacer()
       println("----------------------")
   }
}

