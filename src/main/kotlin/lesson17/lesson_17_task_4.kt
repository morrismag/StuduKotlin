package lesson17

class TravelBox {
    var idBox: Int = 15430
        set(value) {
            if (value != field) println("Нельзя менять ID пасылки!")
        }
    var placeTravel: String = ""
        set(value) {
            counterTravel = +1
            field = value
        }
    var counterTravel: Int = 0
}

fun main() {
    val boxTravel = TravelBox()
    println("Значение счетчика до пересылки \"${boxTravel.counterTravel}\".")
    println("Введи новое место назначения:")
    boxTravel.placeTravel = readln()
    println("Значение счетчика \"${boxTravel.counterTravel}\" после пересылки в пункт \"${boxTravel.placeTravel}\".")
}