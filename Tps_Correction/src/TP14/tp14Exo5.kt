package tp13

inline fun processList(
    list: List<Int>,
    inlinePredicate: (Int) -> Boolean,
    noinline operation: (Int) -> Unit
) {
    list.filter(inlinePredicate).forEach(operation)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    processList(numbers, { it % 2 == 0 }, { println("Even number: $it") })
}
