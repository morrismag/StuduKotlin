package lesson20

fun main() {
    println(setModifier { say() })
}

fun say(): String {
    return listOf(
        "Голос истины противен слуху.",
        "Кто не борется, тот непобедим.",
        "Вами управляет тот, кто вас злит.",
        " Мудрец избегает всякой крайности.",
        "Человек с самого рождения умирает. "
    ).random()
}

fun setModifier(say: (String) -> Unit): String {
    return say().reversed()
}