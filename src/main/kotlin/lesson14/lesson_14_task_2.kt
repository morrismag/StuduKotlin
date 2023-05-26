package lesson14

open class StandardShip1(
    val nameShip: String,
    val speedShip: Int,
    val loadCapacityShip: Int,
) {
    fun shipInformation() {
        println("{$nameShip}")
        println("{$nameShip} скорость $speedShip узлов.")
        println("{$nameShip} средняя грузоподъемность $loadCapacityShip узлов.")
    }
}

class IceBreakerShips(
    nameShip: String,
    speedShip: Int,
    loadCapacityShip: Int,
    val maxDistanceRaid: Int,
    val iceBreak: Boolean = true,
) : StandardShip1(nameShip, speedShip, loadCapacityShip) {
    fun iceBreakInformation() {
        println("{$nameShip}")
        println("{$nameShip} скорость $speedShip узлов.")
        println("{$nameShip} средняя грузоподъемность $loadCapacityShip узлов.")
        println("{$nameShip} максимальный рейд $maxDistanceRaid км.")
        println("Корабль $nameShip может колоть лед? $iceBreak")
    }
}

class CargoShip(
    nameShip: String,
    speedShip: Int,
    loadCapacityShip: Int,
    val maxLoadCapacity: Int,
    val maximumVolume: Int,
) : StandardShip1(nameShip, speedShip, loadCapacityShip) {
    fun cargoInformation() {
        println("{$nameShip}")
        println("{$nameShip} скорость $speedShip узлов.")
        println("{$nameShip} средняя грузоподъемность $loadCapacityShip узлов.")
        println("{$nameShip} может перевозить грузы объемом $maxLoadCapacity, весом $maximumVolume")
    }
}

fun main() {
    val shipSurovii = StandardShip1(
        "Суровый",
        34,
        100
    )
    val shipFrost = IceBreakerShips(
        "Мороз",
        34,
        100,
        3000,
    )
    val shipHeavyTruck = CargoShip(
        "Тяжеловоз",
        34,
        100,
        300,
        5000
    )

    shipSurovii.shipInformation()
    println()
    shipFrost.iceBreakInformation()
    println()
    shipHeavyTruck.cargoInformation()
}