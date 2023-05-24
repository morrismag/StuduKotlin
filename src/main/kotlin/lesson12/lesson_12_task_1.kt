package lesson12

class Weather(){
    var idDay =0
    var nameDay =""
    var temperatureDay=""
    var temperatureNight=""
    var rainIs = false
    var atmosphericPressure=0
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
    val mondayWeather = Weather()
    mondayWeather.idDay=1
    mondayWeather.nameDay="Понедельник"
    mondayWeather.temperatureDay="12"
    mondayWeather.temperatureNight="10"
    mondayWeather.rainIs=true
    mondayWeather.atmosphericPressure=730

    val tuesdayWeather = Weather()
    tuesdayWeather.idDay=2
    tuesdayWeather.nameDay="Вторник"
    tuesdayWeather.temperatureDay="22"
    tuesdayWeather.temperatureNight="15"
    tuesdayWeather.rainIs=false
    tuesdayWeather.atmosphericPressure=715

    mondayWeather.readInformation()
    println()
    tuesdayWeather.readInformation()

}
