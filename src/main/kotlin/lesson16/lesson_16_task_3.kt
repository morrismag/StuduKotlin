package lesson16

class User {
    val login: String = "Max"
    private val password: String = "qwe"

    fun check(inputPassword: String) {
        if (inputPassword == password) println("Пароль верный")
        else println("Увы. В другой раз повезет.")
    }
}

fun main() {
    val user = User()
    println("Если ты ${user.login} введи пароль:")
    val inputPassword = readln()
    user.check(inputPassword)
}