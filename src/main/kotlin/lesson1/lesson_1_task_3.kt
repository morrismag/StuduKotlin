package lesson1
// ... и вновь нас звезды манят в темноту...

fun main(){
    val yearOfFirstFlightAroundTheEarth: String = "1961"
    var hourOfStartFirstFlightAroundTheEarth: String = "09"
    var minutesOfStartFirstFlightAroundTheEarth: String = "07"

    println("Старт полета в космос Юрия Гагарина был в \n $minutesOfStartFirstFlightAroundTheEarth минут" +
            "\n $hourOfStartFirstFlightAroundTheEarth часов" +
            "\n $yearOfFirstFlightAroundTheEarth года. ")
    println()

    minutesOfStartFirstFlightAroundTheEarth = "55"
    hourOfStartFirstFlightAroundTheEarth = "10"

    println("Полет продолжался 108 минут. \n" +
            "Приземлился Юрий Гагарин в $hourOfStartFirstFlightAroundTheEarth:$minutesOfStartFirstFlightAroundTheEarth" +
            " по московскому времени.")

}