package TP1

fun main() {
    print("nombre : ")
    val nombre = readLine()!!.toInt()
    if (nombre % 2 == 0) {
        println("pair")
    } else {
        println("impair")
    }
}
