package lesson17

class User(loginUser: String, passwordUser: String) {
    var loginUser: String = ""
        set(value) {
            field = value
            println("Успешная смена логина на \"$field\"!")
        }
    var passwordUser: String = passwordUser
        set(value) {
            println("Вы не можете сменить пароль!")
        }
        get(): String {
            val value = field.replace(Regex(".(?<=.)"), "*")
            return value
        }
}

fun main() {
    val userTest = User("qwe", "qwerty")
    println("Смени логин:")
    userTest.loginUser = readln()
    println("Смени пароль:")
    userTest.passwordUser = readln()
    println()
    println("Просмотр пароля: ${userTest.passwordUser}")
}