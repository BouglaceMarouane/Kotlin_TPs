//package tp12
//
//fun convertToIntList(strings: List<String>): List<Int> {
//    val result = mutableListOf<Int>()
//    for (s in strings) {
//        try {
//            result.add(s.toInt())
//        } catch (e: NumberFormatException) {
//            println("Erreur: '$s' n'est pas un nombre entier valide.")
//        }
//    }
//    return result
//}
//
//fun main() {
//    val strings = listOf("10", "20", "abc", "30", "4.5")
//    val numbers = convertToIntList(strings)
//    println("Liste des entiers valides: $numbers")
//}
