package lesson10

fun main() {
    val computerPlay = randomNumberPlay(0)
    val userPlay = randomNumberPlay(1)
    println("Ход компьютера: $computerPlay")
    println("Ход игрока: $userPlay")

    when {
        computerPlay > userPlay -> println("Компьютер выйграл.")
        computerPlay < userPlay -> println("Человек выйграл.")
        else -> println("Победила дружба!")
    }
}

fun randomNumberPlay(playerChoice: Int): Int {
    val computer = (1..6).random()
    val user = (1..6).random()

    return if (playerChoice == 0) computer
    else user
}
