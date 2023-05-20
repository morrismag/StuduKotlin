package lesson6

// ... сага о проверке бота ...
fun main() {
    var index = 3
    var sumNum: Int
    var result: Int

    println(
        "То, что угадал ты логин\n" +
                "И пароль сошелся - странно.\n" +
                "Может ты ИИ поганый,\n " +
                "Что написан басурманом.\n" +
                "Хочешь ты взломать акаунт,\n" +
                "Что с трудом огромным Юзверь\n" +
                "Регистрировал три ночи\n" +
                "Ай-яй-яй, но не позволит\n" +
                "Славный наш портал, хваленый,\n" +
                "И задаст тебе вопросы\n" +
                "Словно сфинкс, и три попытки.\n" +
                "Отвечай. Что суммой будет\n" +
                "У цифирей этих строгих:\n"
    )
    do {
        val firstNum = (1..10).random()
        val secondNum = (1..10).random()
        sumNum = firstNum + secondNum
        println("$firstNum + $secondNum =")
        result = readln().toInt()
        index--
    } while ((result != sumNum) && (index > 0))

    if (result == sumNum) println("Добро пожаловать!")
    else println("Доступ запрещен ИИ поганый!")
}
