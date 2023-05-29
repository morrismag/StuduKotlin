package lesson17

class Ship() {
    var nameShip: String = "Звездный"
        set(value) {
            if (value != field) println("Нельзя менять название корабля!")
        }
    val averageSpeed: Int = 30
    val portDislocate: String = "Южный"

}

fun main() {
    val shipZvevdniy = Ship()
    println("Введи имя корабля:")
    shipZvevdniy.nameShip = readln()
}