package lesson5

// ... Кто возмет билетов пачку, тот получит водокачку ...
fun main() {
    val firstNumberWin = (1..100).random()
    val secondNumberWin = (1..100).random()

    // это строка для проверки рандома
    //println("$firstNumberWin $secondNumberWin")

    println("Лотерея!!! Введи 2 числа от 1 до 100 и выйграй!!! \n Число 1:")
    val firstNumber = readln().toInt()
    println("Число 2:")
    val secondNumber = readln().toInt()
    when {
        ((firstNumber == firstNumberWin) && (secondNumber == secondNumberWin)) ->
            println("Поздравляем! Вы выйграли главный приз!!!")

        (((firstNumber == firstNumberWin) && (secondNumber != secondNumberWin)) ||
                ((firstNumber != firstNumberWin) && (secondNumber == secondNumberWin))) ->
            println("Вы выйграли утешительный приз!")

        else -> println("Неудача! Крутите барабан!")
    }
    println("В этом раунде следующие числа победили:\n $firstNumberWin и $secondNumberWin")
}

