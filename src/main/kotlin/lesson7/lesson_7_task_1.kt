package lesson7

fun main() {

    // как сказал бизнес

    val number1 = (1..9).random().toString()
    val number2 = (1..9).random().toString()
    val number3 = (1..9).random().toString()
    val char1 = ('a'..'z').random()
    val char2 = ('a'..'z').random()
    val char3 = ('a'..'z').random()
    println(number1 + char1 + number2 + char2 + number3 + char3)

}