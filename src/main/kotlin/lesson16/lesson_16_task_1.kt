package lesson16

class NumberOfCub{
    private val numberCub = (1..6).random()

    fun takeNumberOfCub(){
        println("Выпало число $numberCub")
    }
}
fun main() {
    val numberOfCub = NumberOfCub()
    numberOfCub.takeNumberOfCub()
}