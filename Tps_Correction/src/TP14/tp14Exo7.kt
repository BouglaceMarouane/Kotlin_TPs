fun findNumber(list: List<Int>, target: Int): Boolean {
    list.forEach {
        if (it == target) return true
    }
    return false
}

fun main() {
    val numbers = listOf(1, 3, 5, 7, 9)

    val result1 = findNumber(numbers, 5)
    println("5 found: $result1")

    val result2 = findNumber(numbers, 4)
    println("4 found: $result2")
}
