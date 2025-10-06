//package tp13
//
//inline fun filterList(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
//    val result = mutableListOf<Int>()
//    for (item in list) {
//        if (predicate(item)) {
//            result.add(item)
//        }
//    }
//    return result
//}
//
//
//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5, 6)
//    val evens = filterList(numbers) { it % 2 == 0 }
//    println(evens)
//}
