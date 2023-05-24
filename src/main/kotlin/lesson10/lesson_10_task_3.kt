package lesson10

fun main() {
    println("Введи длинну пароля. (Число от 1 до 9):")
    var numberOfPassword = readln().toIntOrNull() ?: 0

    while (numberOfPassword !in 1..9) {
        println("Повтори ввод. Напоминаю число от 1 до 9")
        numberOfPassword = readln().toIntOrNull() ?: 0
    }

    generatePassword(numberOfPassword)
}

fun generatePassword(numberOfPassword: Int) {

    val charPart = (33..47).toList().map { it.toChar() }
    val numPart = (1..9).toList()
    var resultPassword = ""

    for (i in 1..numberOfPassword) {
        val charPassword =
            if ((i % 2) != 0) {
                charPart.random().toString()
            } else numPart.random().toString()
        resultPassword += charPassword
    }

    println("Вот тебе пароль:$resultPassword")
}
