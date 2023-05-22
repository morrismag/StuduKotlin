package lesson10

fun main() {
    val computerPlay = random(0)
    val userPlay = random(1)
    println("Ход компьютера: $computerPlay")
    println("Ход игрока: $userPlay")

    when {
        computerPlay > userPlay -> println("Компьютер выйграл.")
        computerPlay < userPlay -> println("Человек выйграл.")
        else -> println("Победила дружба!")
    }
}

fun random(q: Int): Int {
    val computer = (1..6).random()
    val user = (1..6).random()

    return if (q == 0) computer
    else user
}
