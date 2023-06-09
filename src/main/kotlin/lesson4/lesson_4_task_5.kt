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

    val firstCondition: Boolean = ((bodyShip == false)
            && (crew >= CON_MIN_CREW)
            && (crew < CON_BEST_CREW)
            && (eat > CON_EAT)
            && ((weather == false) || (weather == true)))
    val secondCondition: Boolean = (((bodyShip == true)
            && (crew == CON_BEST_CREW)
            && (eat > CON_EAT)
            && (weather == true)
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

const val CON_MIN_CREW = 55
const val CON_BEST_CREW = 70
const val CON_EAT = 50
