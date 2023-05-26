package lesson10

fun main() {
    var sumWin = 0

    do {
        val computerPlay = random(0)
        val userPlay = random(1)
        println("Ход компьютера: $computerPlay")
        println("Ход игрока: $userPlay")
        val resultWin = selectTheResult(computerPlay, userPlay)

        if (resultWin) sumWin++

        println("Хотите ли еще раз поиграть? (ответ да/нет)")
        val answer = readln()
        val answerUser = answer == "да"
    } while (answerUser)

    println("Вы победили всего: $sumWin")
}

fun random(playerId: Int): Int {
    val computer = (1..6).random()
    val user = (1..6).random()

    return if (playerId == 0) computer
    else user
}

fun selectTheResult(computerPlay: Int, userPlay: Int): Boolean {
    when {
        computerPlay < userPlay -> {
            println("Человек выйграл")
        }

        computerPlay > userPlay -> {
            println("Компьютер выйграл")
        }

        else -> {
            println("Ничья")
        }
    }
    return computerPlay < userPlay
}