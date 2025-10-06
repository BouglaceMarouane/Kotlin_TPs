package tp13

inline fun processStrings(list: List<String>, inlinePredicate: (String) -> Boolean, noinline operation: (String) -> Unit)
{
    list.filter(inlinePredicate).forEach(operation)
}


fun main() {
    val words = listOf("apple", "banana", "cherry", "date")
    processStrings(words, { it.startsWith("b") }, { println("Word starts with b: $it") })
}

