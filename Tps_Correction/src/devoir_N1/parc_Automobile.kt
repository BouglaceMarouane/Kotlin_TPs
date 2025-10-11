package devoir_N1

abstract class Vehicule(
    var immatriculation: String,
    var marque: String,
    var modele: String,
    var kilometrage: Int,
    var disponible: Boolean = true
) {
    abstract fun afficherDetails()
    fun estDisponible() = disponible
    fun marquerIndisponible() { disponible = false }
    fun marquerDisponible() { disponible = true }
    fun mettreAJourKilometrage(km: Int) { kilometrage = km }
}

class Voiture(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    disponible: Boolean = true,
    var nombrePortes: Int,
    var typeCarburant: String
) : Vehicule(immatriculation, marque, modele, kilometrage, disponible) {
    override fun afficherDetails() {
        println("Voiture : $immatriculation, $marque, $modele, $kilometrage km, disponible: $disponible, " +
                "$nombrePortes portes, carburant: $typeCarburant")
    }
}

class Moto(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    disponible: Boolean = true,
    var cylindree: Int
) : Vehicule(immatriculation, marque, modele, kilometrage, disponible) {
    override fun afficherDetails() {
        println("Moto : $immatriculation, $marque, $modele, $kilometrage km, disponible: " +
                "$disponible, cylindrée: $cylindree cm³")
    }
}

class Conducteur(var nom: String, var prenom: String, var numeroPermis: String) {
    fun afficherDetails() {
        println("Conducteur : $nom $prenom, permis n° $numeroPermis")
    }
}

class Reservation(var vehicule: Vehicule, var conducteur: Conducteur, var dateDebut: String, var dateFin: String,
    var kilometrageDebut: Int, var kilometrageFin: Int? = null
) {
    fun cloturerReservation(kilometrageRetour: Int) { kilometrageFin = kilometrageRetour
        vehicule.mettreAJourKilometrage(kilometrageRetour)
        vehicule.marquerDisponible()
    }

    fun afficherDetails() {
        println("=== Détails de la réservation ===")
        vehicule.afficherDetails()
        conducteur.afficherDetails()
        println("Date : du $dateDebut au $dateFin")
        println("Kilométrage : début $kilometrageDebut, fin ${kilometrageFin ?: "non défini"}")
        println("================================\n")
    }
}

class ParcAutomobile {
    val vehicules = mutableListOf<Vehicule>()
    val reservations = mutableListOf<Reservation>()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
    }

    fun supprimerVehicule(immatriculation: String) {
        if (!vehicules.removeIf { it.immatriculation == immatriculation }) {
            throw VehiculeNonTrouveException("Véhicule $immatriculation non trouvé dans le parc")
        }
    }

    fun reserverVehicule(immatriculation: String, conducteur: Conducteur, dateDebut: String, dateFin: String) {
        val vehicule = vehicules.find { it.immatriculation == immatriculation }
            ?: throw VehiculeNonTrouveException("Véhicule $immatriculation non trouvé")
        if (!vehicule.estDisponible()) throw VehiculeIndisponibleException("Véhicule $immatriculation non disponible")
        val reservation = Reservation(vehicule, conducteur, dateDebut, dateFin, vehicule.kilometrage)
        reservations.add(reservation)
        vehicule.marquerIndisponible()
    }

    fun afficherVehiculesDisponibles() {
        println("=== Véhicules disponibles ===")
        vehicules.filter { it.estDisponible() }.forEach { it.afficherDetails() }
        println("============================\n")
    }

    fun afficherReservations() {
        if (reservations.isEmpty()) {
            println("Aucune réservation en cours.\n")
        } else {
            reservations.forEach { it.afficherDetails() }
        }
    }
}

class VehiculeIndisponibleException(message: String) : Exception(message)
class VehiculeNonTrouveException(message: String) : Exception(message)

fun main() {
    val parc = ParcAutomobile()

    parc.ajouterVehicule(Voiture("12345", "Toyota", "Corolla",
        100000, true, 4, "Essence"))
    parc.ajouterVehicule(Moto("67890", "Yamaha", "R1",
        1000, true, 1000))
    parc.ajouterVehicule(Voiture("98765", "Honda", "Civic",
        50000, false, 4, "Diesel"))
    parc.ajouterVehicule(Moto("01234", "Suzuki", "GSX",
        500, true, 600))

    val conducteur1 = Conducteur("Jean", "Dupont", "1234567890")
    val conducteur2 = Conducteur("Marie", "Curie", "0987654321")

    try {
        parc.reserverVehicule("12345", conducteur1, "2022-01-01", "2022-01-10")
        parc.reserverVehicule("67890", conducteur2, "2022-01-05", "2022-01-12")
        parc.reserverVehicule("98765", conducteur1, "2022-01-15", "2022-01-20")
    } catch (e: VehiculeIndisponibleException) {
        println("Erreur : ${e.message}\n")
    } catch (e: VehiculeNonTrouveException) {
        println("Erreur : ${e.message}\n")
    }

    parc.afficherVehiculesDisponibles()
    parc.afficherReservations()
}
