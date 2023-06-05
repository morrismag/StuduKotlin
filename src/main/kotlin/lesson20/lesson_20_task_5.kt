package lesson20

class Robot {
    fun say(): String {
        return listOf(
            "Голос истины противен слуху.",
            "Кто не борется, тот непобедим.",
            "Вами управляет тот, кто вас злит.",
            " Мудрец избегает всякой крайности.",
            "Человек с самого рождения умирает. "
        ).random()
    }

    fun setModifier(say: (String) -> Unit) {
        return println( say())

    }
}
fun main() {
    val robotSay = Robot()
    println( robotSay.say().reversed() )
}