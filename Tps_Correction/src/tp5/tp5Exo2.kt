fun main() {

    val success = Success("coins", 5000.0)
    val failure = Failure("visa", "4082345083871830")
    val loading = Loading("PayPal", "5562521488362450")

   check(success)
    check(failure)
     check(loading)



}


sealed class OperationResult(val type: String) {
    abstract fun afficher_details()
}

class Success(type : String ,var data: Double) : OperationResult(type) {
    override fun afficher_details() {println("Type : $type , Data :  information sent")}

}

class Failure(type: String, val errorMessage: String) : OperationResult(type) {
    override fun afficher_details() {println("Type : $type , Error Message : 404")}
}

class Loading(type: String, val data: String) : OperationResult(type) {
    override fun afficher_details() {println("Type : $type , Data :  information generate")}
}


fun check(operationResult: OperationResult) {
     when (operationResult) {
        is Success -> operationResult.afficher_details()
        is Failure ->  operationResult.afficher_details()
        is Loading -> operationResult.afficher_details()
    }

}




