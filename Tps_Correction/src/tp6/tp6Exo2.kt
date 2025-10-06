fun main() {
    val op1 = Addition(10.0, 5.0)
    val op2 = Soustraction(10.0, 3.0)
    val op3 = Multiplication(4.0, 2.5)
    val op4 = Division(20.0, 4.0)
    val op5 = Division(10.0, 0.0)

    val operations = listOf(op1, op2, op3, op4, op5)

    for (op in operations) {
        try {
            val result = calculer(op)
            println("Resultat est : $result")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}



sealed class Operation(val a: Double, val b: Double)

class Addition(a: Double, b: Double) : Operation(a, b)
class Soustraction(a: Double, b: Double) : Operation(a, b)
class Multiplication(a: Double, b: Double) : Operation(a, b)
class Division(a: Double, b: Double) : Operation(a, b)

fun calculer(operation: Operation): Double {
    return when (operation) {
        is Addition -> operation.a + operation.b
        is Soustraction -> operation.a - operation.b
        is Multiplication -> operation.a * operation.b
        is Division -> {
            if (operation.b == 0.0) {
                throw IllegalArgumentException("Erreur : Division par zero.")
            } else {
                operation.a / operation.b
            }
        }
    }
}
