package lesson7

// ... интересная задачка ...
fun main() {
    val randomChars = ('1'..'9') + ('a'..'z')+('A'..'Z')
    println("Введи число от 1 до 9. Такой длинны будет твой пароль:")
    var lengthPassword: Int? = readln().toIntOrNull() ?: 0

    while (lengthPassword !in (1..9)) {
        println("Для особенных повторяю:\n\"ВВЕДИ ЧИСЛО от 1 до 9\". Попробуй снова:")
        lengthPassword = readln().toIntOrNull() ?: 0
    }

    val resultPassword = (1..(lengthPassword?.toInt() ?: 0)).map { randomChars.random() }.joinToString("")
    println("Вот тебе пароль:\n $resultPassword")
}