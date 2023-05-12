package lesson3

fun main() {
    val inpitInformation = "D2-D4;0"
    val fromWhere = inpitInformation.substring(0, 2)
    val whereTo = inpitInformation.substring(3, 5)
    val strokeNumber = inpitInformation.substring(6, 7)

    println("Откуда $fromWhere")
    println("Куда $whereTo")
    println("Номер хода $strokeNumber")
}