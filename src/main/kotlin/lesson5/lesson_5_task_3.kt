package lesson5

// ... Кто возмет билетов пачку, тот получит водокачку ...
fun main() {

    println("Лотерея!!! Введи 2 числа от 1 до 100 и выйграй!!! \n Число 1:")
    val firstNumber = readln().toInt()
    println("Число 2:")
    val secondNumber = readln().toInt()
    when {
        ((firstNumber == FIRST_NUMBER_WIN) && (secondNumber == SECOND_NUMBER_WIN)) ->
            println("Поздравляем! Вы выйграли главный приз!!!")

        (((firstNumber == FIRST_NUMBER_WIN) && (secondNumber != SECOND_NUMBER_WIN)) ||
                ((firstNumber != FIRST_NUMBER_WIN) && (secondNumber == SECOND_NUMBER_WIN))) ->
            println("Вы выйграли утешительный приз!")

        else -> println("Неудача! Крутите барабан!")
    }
    println("В этом раунде следующие числа победили:\n $FIRST_NUMBER_WIN и $SECOND_NUMBER_WIN")
}

const val FIRST_NUMBER_WIN = 6
const val SECOND_NUMBER_WIN = 74