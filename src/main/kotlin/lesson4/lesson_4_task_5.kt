package lesson4

// Решал в лоб. Самому такое решение не нравится. Не смог найти как обработать ввод в консоль,
// когда неправильное значение и заставить оператора снова ввести нужное значение (через цикл)
// Плюс тут нет обработки на неправильный ввод чисел, и null-ов
// т.е. прогу дорабатывать и дорабатывать.

fun main() {
    val conditionFirstBodyShip = false
    val conditionFirstMinCrew = 55
    val conditionFirstBestCrew = 70
    val conditionFirstEat = 50
    val conditionFirstWeather = true
    val conditionFirstWeather1 = false

    val conditionSecondBodyShip = true
    val conditionSecondBestCrew = 70
    val conditionSecondEat = 50
    val conditionSecondWeather = true

    println(
        "Для запуска коробля ответте на следующие вопросы:\n" +
                "Поврежден ли корабль?\n (ввести только - true/false это соответствует да/нет):"
    )
    val bodyShip = readln().toBoolean()
    println("Сколько человек в экипаже?\n (ввести число):")
    val crew: Int = readln().toInt()
    println("Сколько ящиков провизии на борту?\n (ввести число):")
    val eat: Int = readln().toInt()
    println("Благоприятные или нет метеоусловия?\n (ввести только - true/false это соответствует благоприятные/не благоприятные):")
    val weather: Boolean = readln().toBoolean()
    println()

    val result: Boolean =
        if (((bodyShip == conditionFirstBodyShip)
            && (crew >= conditionFirstMinCrew)
            && (crew < conditionFirstBestCrew)
            && (eat > conditionFirstEat)
            && ((weather == conditionFirstWeather) || (weather == conditionFirstWeather1)))
            ||(((bodyShip == conditionSecondBodyShip)
              && (crew == conditionSecondBestCrew)
              && (eat > conditionSecondEat)
              && (weather == conditionSecondWeather)
            )))
        {
            true
        }
        else
        {
            false
        }

    println(
        "Анализ состояния коробля:\n" +
                "Поврежден ли корпус: $bodyShip \n" +
                "Количество экипажа: $crew \n" +
                "Количество ящиков с провизией: $eat \n" +
                "Благоприятные ли метеоусловия: $weather \n" +
                "\n" +
                " На основе введенных данных запуск коробля :\n " +
                "$result "
    )
}