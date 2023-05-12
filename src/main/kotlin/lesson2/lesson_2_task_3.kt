package lesson2

// ... а с платформы говорят: "Это город - Ленинград" ...
fun main() {
    val hoursDeparture = 9
    val minutesDeparture = 39
    val minutesInWay = 457
    var minutesAfterDeparture = 0
    var hoursResult = 0
    var minutesResult = 0

    minutesAfterDeparture = (hoursDeparture * 60 + minutesDeparture + minutesInWay)
    hoursResult = minutesAfterDeparture / 60
    minutesResult = minutesAfterDeparture - hoursResult * 60

    // Два вопроса:
    // Почему строка выше выдает ошибку если раскомментировать? - сделал

    // Тут не предусмотрено что при превышении 24 часов нужно обнулять и считать как то дни? -
    // плохо прочитал задачу, время в пути не превышает полночи.

    println("Время прибытия поезда: $hoursResult:${String.format("%2d", minutesResult)} ")
}