package lesson4

// Решал в лоб. Самому такое решение не нравится. Не смог найти как обработать ввод в консоль,
// когда неправильное значение и заставить оператора снова ввести нужное значение (через цикл)
// Плюс тут нет обработки на неправильный ввод чисел, и null-ов
// т.е. прогу дорабатывать и дорабатывать.

fun main() {

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

    val firstCondition: Boolean = ((bodyShip == CON_FIRST_BODY_SHIP)
            && (crew >= CON_FIRST_MIN_CREW)
            && (crew < CON_FIRST_SECOND_BEST_CREW)
            && (eat > CON_FIRST_SECOND_EAT)
            && ((weather == CON_FIRST_SECOND_WEATHER) || (weather == CON_FIRST_WEATHER)))
    val secondCondition: Boolean = (((bodyShip == CON_SECOND_BODY_SHIP)
            && (crew == CON_FIRST_SECOND_BEST_CREW)
            && (eat > CON_FIRST_SECOND_EAT)
            && (weather == CON_FIRST_SECOND_WEATHER)
            ))
    val result: Boolean = (firstCondition || secondCondition)

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

const val CON_FIRST_BODY_SHIP = false
const val CON_SECOND_BODY_SHIP = true
const val CON_FIRST_MIN_CREW = 55
const val CON_FIRST_SECOND_BEST_CREW = 70
const val CON_FIRST_SECOND_EAT = 50
const val CON_FIRST_SECOND_WEATHER = true
const val CON_FIRST_WEATHER = false