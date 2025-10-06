//fun main() {
//
//    val car = Car("BMW", "Red")
//    val bike = Bike("green")
//
//
//    car.start()
//    car.stop()
//    bike.start()
//    bike.stop()
//
//}
//
//
//interface Vehicle {
//    fun start() {
//
//    }
//    fun stop() {
//
//    }
//}
//
//open class SuperCar (var nom : String){
//    open fun afficher() {
//        println("Nom : $nom")
//        println("--------------------------")
//    }
//}
//
//class Car(nom: String,var couleur : String) : Vehicle,SuperCar(nom) {
//    override fun start() {
//        println("Couleur : $couleur")
//        println("--------------------------")
//    }
//        override fun stop() {
//        println("Couleur : $couleur")
//        println("--------------------------")
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
//class Bike(var couleur: String) : Vehicle {
//    override fun start() {
//        println("Couleur : $couleur")
//        println("--------------------------")
//    }
//        override fun stop() {
//        println("Couleur : $couleur")
//        println("--------------------------")
//    }
//
//}
