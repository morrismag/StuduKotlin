package lesson14

class StandardShip(
    val nameShip: String,
    val speedShip: Int,
    val loadCapacityShip: Int,
) {
    fun speedShipInRaid() {
        println("{$nameShip}: на рейде скоростью $speedShip узла.")
    }

    fun loadCapacity() {
        println("{$nameShip}: Грузоподъемность корабля $loadCapacityShip тонн.")
    }
}

fun main() {
    val shipSurovii = StandardShip(
        "Суровый",
        34,
        100
    )

    shipSurovii.speedShipInRaid()
    shipSurovii.loadCapacity()
}