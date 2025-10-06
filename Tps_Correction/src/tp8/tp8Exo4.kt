//package tp6
//
//class Banque {
//
//    class CompteBancaire(val numeroCompte: String, var solde: Double) {
//
//        fun deposer(montant: Double) {
//            if (montant > 0) {
//                solde += montant
//                println("Depot de $montant effectue. Nouveau solde : $solde")
//            } else {
//                println("Montant de depot invalide.")
//            }
//        }
//
//        fun retirer(montant: Double) {
//            if (montant > 0 && montant <= solde) {
//                solde -= montant
//                println("Retrait de $montant effectue. Nouveau solde : $solde")
//            } else {
//                println("Retrait impossible : montant invalide ou solde insuffisant.")
//            }
//        }
//    }
//
//    fun creerCompte(numero: String, soldeInitial: Double): CompteBancaire {
//        return CompteBancaire(numero, soldeInitial)
//    }
//}
//
//fun main() {
//    val banque = Banque()
//    val compte1 = banque.creerCompte("12345", 1000.0)
//    compte1.deposer(500.0)
//    compte1.retirer(200.0)
//    compte1.retirer(2000.0)
//}