package lesson5

// ... нажми на кнопку - получишь результат, и твоя мечта осуществится ...
fun main() {
    val firstNum = (1..1000).random()
    val secondNum = (1..100).random()
    val sumNum = firstNum + secondNum

    println(
        "Если ты не бот, напиши ответ:\n" +
                "$firstNum + $secondNum ="
    )

    val result = readln()
    if (result == sumNum.toString()) println("Добро пожаловать!")
    else println("Доступ запрещен!!!")
}