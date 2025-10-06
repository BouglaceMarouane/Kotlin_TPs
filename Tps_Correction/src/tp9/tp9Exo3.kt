//class MonThread(private val nom: String) : Runnable {
//    override fun run() {
//        for (i in 1..5) {
//            println("Thread $nom : exécution $i")
//            Thread.sleep(1000)
//        }
//    }
//}
//
//fun main() {
//    val t1 = Thread(MonThread("A"))
//    val t2 = Thread(MonThread("B"))
//    val t3 = Thread(MonThread("C"))
//
//    t1.start()
//    t2.start()
//    t3.start()
//}
