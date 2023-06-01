package lesson17

class Ship(
    nameShip: String,
    val averageSpeed: Int,
    val portDislocate: String
) {
    var nameShip: String = ""
        set(value) {
            println("Нельзя менять название корабля!")
        }
}

fun main() {
    val shipZvevdniy = Ship("Звездный", 30, "Moon")
    println("Введи имя корабля:")
    shipZvevdniy.nameShip = readln()
}