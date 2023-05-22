package lesson10

fun main() {
    println("Введи длинну пароля. (Число от 1 до 9):")
    var numberOfPassword = readln().toIntOrNull() ?: 0

    while (numberOfPassword !in 1..9) {
        println("Повтори ввод. Напоминаю число от 1 до 9")
        numberOfPassword = readln().toIntOrNull() ?: 0
    }

    generationPassword(numberOfPassword)
}

fun generationPassword(numberOfPassword: Int) {
    val charPart: MutableList<Char> = ("!\"#\$%&'()*+,-./ ").toMutableList()
    val numPart: MutableList<Char> = ("123456789").toMutableList()
    val resultPassword: Array<String> = Array(numberOfPassword) { "" }

    for (i in resultPassword.indices) {
        if ((i % 2) != 0) {
            resultPassword[i] = charPart.random().toString()
        } else resultPassword[i] = numPart.random().toString()
    }

    println("Вот тебе пароль:${resultPassword.joinToString("")}")
}
