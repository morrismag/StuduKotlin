package lesson2

fun main() {
    val hoursDeparture = 9
    val minutesDeparture = 39
    val minutesInWay = 457
    var minutesAfterDeparture = 0
    var hoursResult = 0
    var minutesResult = 0

    minutesAfterDeparture = (hoursDeparture*60 + minutesDeparture + minutesInWay)
    hoursResult = minutesAfterDeparture/60
    minutesResult = minutesAfterDeparture - hoursResult*60

    //val minutesResult1 = String.format("%.2f", minutesResult)

    // Два вопроса:
    // Почему строка выше выдает ошибку если раскомментировать?
    // Тут не предусмотрено что при превышении 24 часов нужно обнулять и считать как то дни?

    println("Время прибытия поезда: $hoursResult:$minutesResult ")

}