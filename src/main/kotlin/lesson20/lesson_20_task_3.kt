package lesson20

class Gamer(
    val nameGamer: String,
    val keyIsOrNot: Boolean = false,
)

fun main() {
    val gamer = Gamer("Den", true)
    val checkKey = {
        if (gamer.keyIsOrNot) println("Можешь пройти ${gamer.nameGamer}.")
        else println("Ищи ключ, салага.")
    }
    checkKey()
}