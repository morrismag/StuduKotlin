package lesson10

fun main() {
    var sumWin = 0

    do {
        val computerPlay = random(0)
        val userPlay = random(1)
        println("Ход компьютера: $computerPlay")
        println("Ход игрока: $userPlay")

        val resultWin = selectingTheResult(computerPlay, userPlay)

        if (resultWin == 1) sumWin++

        println("Хотите ли еще раз поиграть? (ответ да/нет)")
        val answer = readln()

        val answerUser = when (answer) {
            "да" -> true
            else -> false
        }
    } while (answerUser)

    println("Вы победили всего: $sumWin")
}

fun random(q: Int): Int {
    val computer = (1..6).random()
    val user = (1..6).random()

    return if (q == 0) computer
    else user
}

fun selectingTheResult(computerPlay: Int, userPlay: Int): Int {
    val resultWin = when {
        computerPlay > userPlay -> {
            println("Компьютер выйграл.")
            0
        }

        computerPlay < userPlay -> {
            println("Человек выйграл.")
            1
        }

        else -> {
            println("Победила дружба!")
            0
        }
    }
    return resultWin
}