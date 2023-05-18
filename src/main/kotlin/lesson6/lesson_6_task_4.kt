package lesson6

// ... направо пойдешь - жену найдешь,
// налево пойдешь -коня потеряешь,
// а прямо пойдешь - о камень уе...шься ...
fun main() {
    println("Угадай число от 1 до 9. У тебя есть 5 попыток. Дерзай:")
    var numResult = readln().toInt()
    var index = 4
    while ((index > 0) && (numResult != NUMBER_WIN)) {
        println("Неверно. Осталось  ${index} попыток. Попробуй еще раз:")
        numResult = readln().toInt()
        index--
    }
    if (numResult == NUMBER_WIN) println("Это была великолепная игра!")
    else println("Ты проиграл. Было загадано число $NUMBER_WIN")
}

const val NUMBER_WIN = 7