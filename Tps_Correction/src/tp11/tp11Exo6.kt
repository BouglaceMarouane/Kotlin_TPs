//
//
//class NegativeNumberException(message: String) : Exception(message)
//
//fun convertToInt(str: String): Int? {
//    return try {
//        val number = str.toInt()
//        if (number < 0) throw NegativeNumberException("Erreur : nombre negatif " +
//                "non autorise.")
//        number
//    } catch (e: NumberFormatException) {
//        println("Erreur : la chaine ne peut pas être convertie en entier.")
//        null
//    } catch (e: NegativeNumberException) {
//        println(e.message)
//        null
//    }
//}
//
//fun main() {
//    println("Convertir '25' : ${convertToInt("25")}")
//    println("Convertir '-10' : ${convertToInt("-10")}")
//    println("Convertir 'abc' : ${convertToInt("abc")}")
//}
