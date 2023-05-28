package lesson12

class Day3(
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
    val daysList: List<Day3> = List(10) { createDay() }

    val averageTemperInDay = createDayTemperInDay(daysList).average()
    val averageTemperInNight = createDayTemperInNight(daysList).average()
    val averageAtmosphericPressure = createDayAtmosphericPressure(daysList).average()
    val sumRainDays = daysList.sumOf { rainBooleanToInt(it.rainIs) }

    println("Средняя температура днем: $averageTemperInDay")
    println("Средняя температура ночью: $averageTemperInNight")
    println("Средняя атмосферное давление: $averageAtmosphericPressure")
    println("Сумма дождливых дней: $sumRainDays")
}

fun createDay(): Day3 {
    return Day3(
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

fun createDayTemperInDay(list: List<Day3>): MutableList<Int> {
    var listT: MutableList<Int> = mutableListOf()
    for (i in list.indices) {
        listT = mutableListOf(list[i].temperatureDay)
    }
    return listT
}

fun createDayTemperInNight(list: List<Day3>): MutableList<Int> {
    var listT: MutableList<Int> = mutableListOf()
    for (i in list.indices) {
        listT = mutableListOf(list[i].temperatureNight)
    }
    return listT
}

fun createDayAtmosphericPressure(list: List<Day3>): MutableList<Int> {
    var listT: MutableList<Int> = mutableListOf()
    for (i in list.indices) {
        listT = mutableListOf(list[i].atmosphericPressure)
    }
    return listT
}