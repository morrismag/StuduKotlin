package lesson3
// ... чпок! Добрый вечер ...

// ... Задача решена только для формата времени 24 часа...
// ... Для AM и PM решается с помощью нахождения в строке этих элементов с помощью сравнения и дальше по аналогии ...

import java.time.Clock
import java.time.LocalTime
import java.time.ZoneId

fun main() {
    val listOfGreetings: Array<String> = arrayOf(
        "Доброе утро.",
        "Добрый день.",
        "Добрый вечер.",
        "Какого черта ты не спишь!",
    )
    val nameOfUser = "Макс"
    val hoursTime = LocalTime.now(Clock.system(ZoneId.systemDefault())).hour
    val resultGreeting =
        if (hoursTime in 6..11) {
            "${listOfGreetings[0]} $nameOfUser"
        } else if (hoursTime in 12..17) {
            "${listOfGreetings[1]} $nameOfUser"
        } else if (hoursTime in 18..21) {
            "${listOfGreetings[2]} $nameOfUser"
        } else {
            "${listOfGreetings[3]} $nameOfUser"
        }

    println(resultGreeting)

}