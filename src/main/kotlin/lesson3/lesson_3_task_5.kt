package lesson3

fun main() {
    val inpitInformation = "D2-D4;0"
    val fromWhere = inpitInformation.split("-",";").get(0)
    val whereTo = inpitInformation.split("-",";").get(1)
    val strokeNumber = inpitInformation.split("-",";").get(2)

    println("Откуда $fromWhere")
    println("Куда $whereTo")
    println("Номер хода $strokeNumber")
}