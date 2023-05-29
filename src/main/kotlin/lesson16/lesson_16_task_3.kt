package lesson16

class User(
    val login: String,
    private val password: String
) {
    fun check(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user = User(
        "Max",
        "qwe"
    )
    println("Если ты ${user.login} введи пароль:")
    val inputPassword = readln()

    if (user.check(inputPassword)) println("Пароль верный")
    else println("Увы. В другой раз повезет.")
}