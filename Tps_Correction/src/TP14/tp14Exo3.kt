//package tp13
//
//inline fun measureTime(taskName: String, block: () -> Unit) {
//    val start = System.currentTimeMillis()
//    block()
//    val end = System.currentTimeMillis()
//    println("$taskName took ${end - start} ms")
//}
//
//fun main() {
//    measureTime ("calcul") {
//        println("Action executee")
//    }
//}