package TP2

fun main() {
   val car = Car()
   car.affiche()

   car.UpdateMarque()
   car.UpdateModele()
   car.UpdateCouleur()
   car.UpdateKilometrage()

   println("Après modification:")
   car.affiche()
}


class Car {
   var marque : String = "BMW"
   var modèle : String = "V8"
   var couleur : String = "Red"
   var kilométrage : Int = 60000

   fun UpdateMarque() {
       print("La marque: ")
       marque = readLine()!!
   }

   fun UpdateModele() {
       print("Le modèle: ")
       modèle = readLine()!!
   }

   fun UpdateCouleur() {
       print("La couleur: ")
       couleur = readLine()!!
   }

   fun UpdateKilometrage() {
       print("kilométrage: ")
       kilométrage = readLine()!!.toInt()
   }

   fun affiche() {
       println("marque: $marque, modèle: $modèle, couleur: $couleur, kilométrage: $kilométrage")
   }

}
