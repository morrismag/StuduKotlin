package lesson20

class Robot(
    val list: List<String> = listOf(
        "Голос истины противен слуху.",
        "Кто не борется, тот непобедим.",
        "Вами управляет тот, кто вас злит.",
        " Мудрец избегает всякой крайности.",
        "Человек с самого рождения умирает. "
    )
) {
    val result: String = list.random()
    fun say(): String? {
        return if (modifier == null) result
        else modifier?.invoke(result)
    }

    private var modifier: ((String) -> String)? = null

    fun setModifier(modifierA: (String) -> String) {
        { modifier = modifierA }
    }
}

fun main() {
    val robotSay = Robot()
    println(robotSay.say())
    robotSay.setModifier { it.reversed() }
    println(robotSay.say())


}