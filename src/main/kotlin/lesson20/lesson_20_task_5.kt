package lesson20

class Robot(
    val listPhrases: List<String> = listOf(
        "Голос истины противен слуху.",
        "Кто не борется, тот непобедим.",
        "Вами управляет тот, кто вас злит.",
        " Мудрец избегает всякой крайности.",
        "Человек с самого рождения умирает. "
    )
) {
    private var modifier: ((String) -> String) = { it }

    fun say() {
        val phraseRandom = listPhrases.random()
        println(modifier(phraseRandom))
    }

    fun setModifier(modifierA: (String) -> String) {
        this.modifier = modifierA
    }
}

fun main() {
    val robotSay = Robot()
    robotSay.say()
    robotSay.setModifier { it.reversed() }
    robotSay.say()
}