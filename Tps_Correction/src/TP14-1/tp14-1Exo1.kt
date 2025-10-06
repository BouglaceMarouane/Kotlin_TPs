package `tp14-1`

import kotlinx.coroutines.*

suspend fun verifierDisponibilite() {
    delay(2000)
    println("GlobalScope - Fin tache 1")
}

suspend fun preparerCommande() {
    delay(5000)
    println("GlobalScope - Fin tache 2")
}

suspend fun livrerRepas() = withContext(Dispatchers.IO) {
    delay(3000)
    println("GlobalScope - Fin tache 3")
}

fun main() = runBlocking {
    val dispo = async { verifierDisponibilite() }
    dispo.await()

    val preparer = async { preparerCommande() }
    preparer.await()

    val livrer = async { livrerRepas() }
    livrer.await()
}
