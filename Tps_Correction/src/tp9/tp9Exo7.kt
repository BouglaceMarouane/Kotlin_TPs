class DatabaseConnection {
    fun connecter() = println("Connexion établie")
    fun executerRequete() = println("Requête exécutée")
}

class DatabaseManager {
    lateinit var connexion: DatabaseConnection

    fun initialiserConnexion() {
        connexion = DatabaseConnection()
        connexion.connecter()
    }

    fun utiliserConnexion() {
        if (::connexion.isInitialized) {
            connexion.executerRequete()
        } else {
            println("Erreur : Connexion non initialisée")
        }
    }
}

fun main() {
    val manager = DatabaseManager()
    manager.initialiserConnexion()
    manager.utiliserConnexion()
}
