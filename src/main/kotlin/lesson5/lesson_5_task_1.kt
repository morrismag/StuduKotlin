package lesson5
// ... нажми на кнопку - получишь результат, и твоя мечта осуществится ...
fun main() {

    println("Если ты не бот, напиши ответ:\n4+87 =")

    val result = readln()
        if (result == "91") println("Добро пожаловать!")
        else println("Доступ запрещен!!!")
}