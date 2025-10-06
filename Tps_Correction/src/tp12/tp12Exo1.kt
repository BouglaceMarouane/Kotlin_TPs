//package tp12
//
//fun findMax (nmbs : List<Int>, comparison : (Int, Int) -> Boolean) {
//    var max = nmbs[0]
//    for (nmb in nmbs) {
//        if (comparison(nmb, max)) {
//            max = nmb
//        }
//    }
//    println(max)
//}
//
//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    findMax(numbers) { n1, n2 -> n1 > n2 }
//}