package lesson7

// ... если так сделать, то сторочку авторизации нельзя изменить она повторяется ...
fun main() {

    do {
        val smsNumber = (1000..9999).random()
        println("Ваш код авторизации $smsNumber.\n Введите его:")
        val authorisationNumber = readln().toIntOrNull()
    } while (authorisationNumber != smsNumber)

    println("Авторизация прошла. Добро пожаловать!")
}