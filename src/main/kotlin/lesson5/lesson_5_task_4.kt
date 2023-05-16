package lesson5

// ... Ах какой же я придумал пароль ...
fun main() {
    println("Приветствуем Вас пользователь. \n Введите логин:")
    val loginU = readln()
    if (loginU == LOGIN_USER) {
        println("Введите пароль")
        val paswordU = readln()
        if (paswordU == PASSWORD_USER) println("Мы рады вас снова видеть $loginU.")
        else println("Неправильно введен пароль. Попробуйте еще раз.")
    } else println("Такой пользователь не зарегистрирован. Пройдите, пожалуйста, регистрацию.")
}

const val LOGIN_USER = "Batman"
const val PASSWORD_USER = "password"