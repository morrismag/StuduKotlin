package lesson20

class Gamer(
    val nameGamer: String,
    val keyIsOrNot: Boolean = false,
)

fun main() {
    val gamer = Gamer("Den", true)
    val checkKey = fun(flagKey: Boolean) {
        if (flagKey) println("Можешь пройти ${gamer.nameGamer}.")
        else println("Ищи ключ, салага.")
    }
    checkKey(gamer.keyIsOrNot)
}