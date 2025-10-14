open class Vehicule(val marque: String) {

   init {
       println("L'objet est creer avec success")
   }
}

class Voiture(marque: String, val nombrePortes: Int) : Vehicule(marque) {
   init{
       println("L'objet est creer avec success")
   }
}

class Camion(marque: String, val capaciteCharge: Int) : Vehicule(marque) {
   init{
       println("L'objet est creer avec success")
   }
}

fun main() {

   val voiture1 = Voiture("Toyota", 4)
   val voiture2 = Voiture("BMW", 4)

   val camion1 = Camion("Decathlon", 4400)
   val camion2 = Camion("Giant", 5000)


}



