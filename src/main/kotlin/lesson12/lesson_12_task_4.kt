package lesson12

class Day2(
    val idDay: Int,
    val nameDay: String,
    val temperatureDay: String,
    val temperatureNight: String,
    val atmosphericPressure: Int,
    val rainIs: Boolean = false,
) {
    fun readInformation() {
        println("Информация о погоде за день\n$idDay")
        println(nameDay)
        println(temperatureDay)
        println(temperatureNight)
        println(rainIs)
        println(atmosphericPressure)
    }

    init {
        println("Информация о погоде за день\n$idDay")
        println(nameDay)
        println(temperatureDay)
        println(temperatureNight)
        println(rainIs)
        println(atmosphericPressure)
    }
}

fun main() {
    Day2(
        1,
        "Понедельник",
        "24",
        "12",
        730
    )
    Day2(
        2,
        "Вторник",
        "22",
        "14",
        720,
        true
    )
    Day2(
        3,
        "Среда",
        "30",
        "10",
        725
    )
}