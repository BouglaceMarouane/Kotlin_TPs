//fun saisirNombre(message: String): Double? {
//    print(message)
//    return readLine()?.toDoubleOrNull()
//}
//
//// Fonction pour l'addition
//fun calculerAddition(a: Double, b: Double) {
//    val resultat = a + b
//    println("Addition : $a + $b = $resultat")
//}
//
//// Fonction pour la soustraction
//fun calculerSoustraction(a: Double, b: Double) {
//    val resultat = a - b
//    println("Soustraction : $a - $b = $resultat")
//}
//
//// Fonction pour la multiplication
//fun calculerMultiplication(a: Double, b: Double) {
//    val resultat = a * b
//    println("Multiplication : $a × $b = $resultat")
//}
//
//// Fonction pour la division avec gestion d'erreur
//fun calculerDivision(a: Double, b: Double) {
//    if (b != 0.0) {
//        val resultat = a / b
//        println("Division : $a ÷ $b = $resultat")
//    } else {
//        println("Division : Impossible de diviser par zero!")
//    }
//}
//
//// Fonction pour comparer les deux nombres
//fun comparerNombres(a: Double, b: Double) {
//    when {
//        a > b -> println("Le premier nombre ($a) est superieur au second ($b)")
//        a < b -> println("Le premier nombre ($a) est inferieur au second ($b)")
//        else -> println("Les deux nombres sont egaux ($a = $b)")
//    }
//}
//
//// Fonction pour verifier si la somme est paire ou impaire
//fun verifierPariteSomme(a: Double, b: Double) {
//    val somme = a + b
//    if (somme % 2 == 0.0) {
//        println("La somme des deux nombres ($somme) est paire")
//    } else {
//        println("La somme des deux nombres ($somme) est impaire")
//    }
//}
//
//fun main() {
//    println("=== Calculatrice Arithmetique ===")
//
//    val premier = saisirNombre("Veuillez saisir le premier nombre : ")
//    val second = saisirNombre("Veuillez saisir le second nombre : ")
//
//    if (premier == null || second == null) {
//        println("Erreur : Veuillez saisir des nombres valides.")
//        return
//    }
//
//    println("\n=== Resultats des operations ===")
//
//    calculerAddition(premier, second)
//    calculerSoustraction(premier, second)
//    calculerMultiplication(premier, second)
//    calculerDivision(premier, second)
//
//    println("\n=== Comparaisons et verifications ===")
//
//    comparerNombres(premier, second)
//    verifierPariteSomme(premier, second)
//}