//fun main() {
//
//    val cashPayment = CashPayment("coins", 5000.0)
//    val cardPayment = CardPayment("visa", "4082345083871830")
//    val digitalPayment = DigitalPayment("PayPal", "5562521488362450")
//
//    println(check(cashPayment))
//    println(check(cardPayment))
//    println(check(digitalPayment))
//
//    cashPayment.afficher_details()
//    cardPayment.afficher_details()
//    digitalPayment.afficher_details()
//
//}
//
//
//sealed class Payment(val type: String) {
//
//}
//
//class CashPayment(type : String ,var amount: Double) : Payment(type) {
//    fun afficher_details() {println("Type : $type")}
//
//}
//
//class CardPayment(type: String, val cardNumber: String) : Payment(type) {
//    fun afficher_details() {println("Type : $type")}
//}
//
//class DigitalPayment(type: String, val cardNumber: String) : Payment(type) {
//    fun afficher_details() {println("Type : $type")}
//}
//
//
//fun check(payment: Payment): String {
//    val paymentType = when (payment) {
//        is CashPayment -> "Payment par cash"
//        is CardPayment -> "Payment par card"
//        is DigitalPayment -> "Payment par Digital"
//    }
//    return paymentType
//}
//
//
//
//
