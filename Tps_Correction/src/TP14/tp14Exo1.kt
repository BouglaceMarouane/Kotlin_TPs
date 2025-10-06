//package tp14
//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//    println("Debut de l'application [Thread: ${Thread.currentThread().name}]")
//
//    val jobGlobal = GlobalScope.launch {
//        println("GlobalScope - Debut tache 1 (Telechargement)...")
//        delay(3000)
//        println("GlobalScope - Fin tache 1")
//    }
//
//    val customScope = CoroutineScope(Dispatchers.Default)
//    val jobCustom = customScope.launch {
//        println("CoroutineScope - Debut tache 2 (Traitement)...")
//        delay(5000)
//        println("CoroutineScope - Fin tache 2")
//    }
//
//    delay(2000)
//    println("Annulation du scope personnalise apres 2s")
//    jobCustom.cancel()
//
//    println("runBlocking - Debut tache 3 (Synchronisation)")
//    delay(2000)
//    println("runBlocking - Fin tache 3")
//
//    jobGlobal.join()
//
//    println("Fin de l'application")
//}
