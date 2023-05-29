package lesson16

class NumberOfCube {
    private val numberCube = (1..6).random()

    fun printNumberOfCube() {
        println("Выпало число $numberCube")
    }
}

fun main() {
    val numberOfCub = NumberOfCube()
    numberOfCub.printNumberOfCube()
}