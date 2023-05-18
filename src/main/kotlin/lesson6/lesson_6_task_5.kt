package lesson6
// ... сага о проверке бота ...
fun main() {
    var firstNum = (1..10).random()
    var secondNum = (1..10).random()
    var sumNum = firstNum + secondNum

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
        "У цифирей этих строгих:\n" +
        "$firstNum + $secondNum ="
    )
    var result = readln().toInt()
    var index = 2
    while ((result != sumNum) && (index > 0)) {
        firstNum = (1..10).random()
        secondNum = (1..10).random()
        sumNum = firstNum + secondNum
        println(
            "Меня терзают смутные сомнения... А ты не засланный казачок?\n" +
                    "У тебя осталось $index попыток. Давай-ка снова попробуй\n" +
                    "$firstNum + $secondNum ="
        )
        result = readln().toInt()
        index--
    }

    if (result == sumNum) println("Добро пожаловать!")
    else println("Доступ запрещен ИИ поганый!")
}