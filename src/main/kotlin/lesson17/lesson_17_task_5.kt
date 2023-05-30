package lesson17

class User {
    var loginUser: String = "Max"
        set(value) {
            field = value
            println("Успешная смена логина на \"$field\"!")
        }
    var passwordUser: String = "qwerty"
        set(value) {
            if (value != field) println("Вы не можете сменить пароль!")
        }
        get() {
            field = field.replace(Regex(".(?<=.)"), "*")
            return field
        }
}

fun main() {
    val userTest = User()
    println("Смени логин:")
    userTest.loginUser = readln()
    println("Смени пароль:")
    userTest.passwordUser = readln()
    println()
    println("Просмотр пароля: ${userTest.passwordUser}")
}