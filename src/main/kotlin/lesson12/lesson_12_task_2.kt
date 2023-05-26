package lesson12

class Weather2(
    _idDay:Int,
    _nameDay: String,
    _temperatureDay: String,
    _temperatureNight:String,
    _rainIs: Boolean,
    _atmosphericPressure: Int,
){
    var idDay =_idDay
    var nameDay =_nameDay
    var temperatureDay=_temperatureDay
    var temperatureNight=_temperatureNight
    var rainIs = _rainIs
    var atmosphericPressure=_atmosphericPressure
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
        Weather2(1,
            "Понедельник",
            "24",
            "12",
            false,
            730)


    val tuesdayWeather =
        Weather2(2,
            "Вторник",
            "22",
            "14",
            true,
            720)

    val wednesdayWeather =
        Weather2(3,
            "Среда",
            "30",
            "10",
            false,
            725)

    mondayWeather.readInformation()
    println()
    tuesdayWeather.readInformation()
    println()
    wednesdayWeather.readInformation()

}