//package tp8
//
//enum class Types_Animaux {
//    TERRESTRE,
//    VOLANT,
//    AQUATIQUE;
//
//    fun message(): String {
//        return when (this) {
//            TERRESTRE -> "les animaux qui vivent sur la terre ferme."
//            VOLANT -> " les animaux capables de vole."
//            AQUATIQUE -> "les animaux qui vivent dans l'eau."
//        }
//    }
//}
//
//interface Volant {
//    fun voler() : String
//}
//interface Aquatique {
//    fun nager() : String
//}
//
//sealed class Animal(open var nom : String, open var espece : String, open var type : Types_Animaux) {}
//
//data class Terrestre(override var nom : String, override var espece : String, override var type : Types_Animaux) : Animal(nom, espece, type) {}
//data class VolantAnimal(override var nom : String, override var espece : String, override var type : Types_Animaux) : Animal(nom, espece, type), Volant {
//    override fun voler(): String {
//        return "Animal est en vol."
//    }
//}
//data class AquatiqueAnimal(override var nom : String, override var espece : String, override var type : Types_Animaux) : Animal(nom, espece, type), Aquatique {
//    override fun nager(): String {
//        return "Animal est nage."
//    }
//}
//
//
//
//
//fun ajouterAnimal(animaux: MutableList<Animal>, animal: Animal) {
//    animaux.add(animal)
//}
//
//fun main() {
//
//
//    val chat = Terrestre("Felix", "Chat", Types_Animaux.TERRESTRE)
//    val aigle = VolantAnimal("Aigle Royal", "Aigle", Types_Animaux.VOLANT)
//    val dauphin = AquatiqueAnimal("Flipper", "Dauphin", Types_Animaux.AQUATIQUE)
//
//    val animaux = mutableListOf<Animal>(chat, aigle, dauphin)
//
//    val serpent = Terrestre("Kaa", "Serpent", Types_Animaux.TERRESTRE)
//    ajouterAnimal(animaux, serpent)
//
//    animaux.forEach {
//        println("${it.nom} - ${it.espece} - ${it.type.message()}")
//    }
//
//    println(aigle.voler())
//    println(dauphin.nager())
//}
