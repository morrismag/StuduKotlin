package lesson7

// ... интересная задачка ...
fun main() {
    val randomChars = ('1'..'9') + ('a'..'z') + ('A'..'Z').random()
    println("Введи число от 1 до 9. Такой длинны будет твой пароль:")
    var lengthPassword = readln().toIntOrNull()
    while (lengthPassword !in (1..9)) {
        println("Для особенных повторяю:\n\"ВВЕДИ ЧИСЛО от 1 до 9\". Попробуй снова:")
        lengthPassword = readln().toIntOrNull()
    }
    val resultPassword = (1..lengthPassword!!).map { randomChars.random() }.joinToString("")
    println("Вот тебе пароль:\n $resultPassword")
}