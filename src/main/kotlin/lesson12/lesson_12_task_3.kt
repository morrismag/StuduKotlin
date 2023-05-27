package lesson12

class Day(
    val idDay: Int,
    val nameDay: String,
    val temperatureDay: String,
    val temperatureNight: String,
    val atmosphericPressure: Int,
    val rainIs: Boolean = false,
) {

    fun readInformation() {
        println("Информация о погоде\n$idDay")
        println(nameDay)
        println(temperatureDay)
        println(temperatureNight)
        println(rainIs)
        println(atmosphericPressure)
    }

}

fun main() {
    val mondayWeather =
        Day(
            1,
            "Понедельник",
            "24",
            "12",
            730
        )
    val tuesdayWeather =
        Day(
            2,
            "Вторник",
            "22",
            "14",
            720,
            true
        )
    val wednesdayWeather =
        Day(
            3,
            "Среда",
            "30",
            "10",
            725
        )

    mondayWeather.readInformation()
    println()
    tuesdayWeather.readInformation()
    println()
    wednesdayWeather.readInformation()
}