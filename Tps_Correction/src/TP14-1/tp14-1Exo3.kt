//import kotlinx.coroutines.*
//import `tp14-1`.livrerRepas
//import `tp14-1`.preparerCommande
//import `tp14-1`.verifierDisponibilite
//
//suspend fun verifierDisponibilite() {
//    delay(2000)
//}
//
//suspend fun preparerCommande() {
//    delay(5000)
//}
//
//suspend fun livrerRepas() = withContext(Dispatchers.IO) {
//    delay(3000)
//}
//
//fun main() = runBlocking {
//    val dispo = async { verifierDisponibilite() }
//    dispo.await()
//
//    val preparer = async { preparerCommande() }
//    preparer.await()
//
//    val livrer = async { livrerRepas() }
//    livrer.await()
//}
