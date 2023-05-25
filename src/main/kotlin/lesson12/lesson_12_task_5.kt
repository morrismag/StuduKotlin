package lesson12

class Day(
    var idDay: Int,
    var temperatureDay: Int,
    var temperatureNight: Int,
    var atmosphericPressure: Int,
    var rainIs: Boolean = false,
) {
    fun readInformation() {
        println("Информация о погоде за день\n$idDay")
        println(temperatureDay)
        println(temperatureNight)
        println(rainIs)
        println(atmosphericPressure)
    }
}

fun main() {
    val daysList: List<Day> = List(10) { createDay() }

    val averageTemperInDay = daysList.sumOf { it.temperatureDay } / daysList.size
    val averageTemperInNight = daysList.sumOf { it.temperatureNight } / daysList.size
    val averageAtmosphericPressure = daysList.sumOf { it.atmosphericPressure } / daysList.size
    val sumRainDays = daysList.sumOf { rainBooleanToInt(it.rainIs) }

    println("Средняя температура днем: $averageTemperInDay")
    println("Средняя температура ночью: $averageTemperInNight")
    println("Средняя атмосферное давление: $averageAtmosphericPressure")
    println("Сумма дождливых дней: $sumRainDays")
}

fun createDay(): Day {
    return Day(
        idDay = (1..10).random(),
        temperatureDay = (10..30).random(),
        temperatureNight = (10..30).random(),
        atmosphericPressure = (730..750).random(),
        rainIs = rainIsRandom()
    )
}

fun rainIsRandom(): Boolean {
    val numRandom = (0..1).random()
    return numRandom == 1
}

fun rainBooleanToInt(inputBoolean: Boolean): Int {
    return if (inputBoolean) 1 else 0
}