//fun countElements(list: List<Int>, condition: (Int) -> Boolean): Int {
//    var count = 0
//    for (element in list) {
//        if (condition(element)) {
//            count++
//        }
//    }
//    return count
//}
//
//fun main() {
//    val numbers = listOf(1, 4, 7, 12, 18, 25, 30)
//
//    val evenCount = countElements(numbers) { it % 2 == 0 }
//    println("Nombres pairs : $evenCount")
//
//    val greaterThanTen = countElements(numbers) { it > 10 }
//    println("Nombres supérieurs à 10 : $greaterThanTen")
//}
