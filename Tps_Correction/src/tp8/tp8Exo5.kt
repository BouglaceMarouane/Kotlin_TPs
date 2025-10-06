//package tp6
//
//enum class EtatCommande {
//    EN_COURS,
//    EXPEDIEE,
//    LIVREE,
//    ANNULEE;
//
//    fun message(): String {
//        return when (this) {
//            EN_COURS -> "La commande est en cours de traitement."
//            EXPEDIEE -> "La commande a ete expediee."
//            LIVREE -> "La commande a ete livree."
//            ANNULEE -> "La commande a ete annulee."
//        }
//    }
//}
//
//class Commande(val numeroCommande: String, var etat: EtatCommande) {
//    fun changerEtat(nouvelEtat: EtatCommande) {
//        etat = nouvelEtat
//    }
//}
//
//fun main() {
//    val commande = Commande("CMD001", EtatCommande.EN_COURS)
//    println("Etat actuel: ${commande.etat}")
//    println(commande.etat.message())
//
//    commande.changerEtat(EtatCommande.EXPEDIEE)
//    println("Nouvel etat: ${commande.etat}")
//    println(commande.etat.message())
//}
