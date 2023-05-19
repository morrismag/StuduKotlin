package lesson7

// ... случайный поворот ...
fun main() {
    var smsNumber = (1000..9999).random()
    println("Ваш код авторизации ${smsNumber}.\nВведите его:")
    var authorisationNumber = readln().toInt()
    while (authorisationNumber != smsNumber) {
        smsNumber = (1000..9999).random()
        println("Ваш новый код авторизации ${smsNumber}.\n Введите его:")
        authorisationNumber = readln().toInt()
    }
    println("Авторизация прошла. Добро пожаловать!")
}