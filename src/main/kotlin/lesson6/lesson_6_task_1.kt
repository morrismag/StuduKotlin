package lesson6

// ... тук-тук-тук.
// Кто там?
// Я.
// Входи ...
fun main() {

    println(
        "Уважаемый пользователь, зарегистрируйте, пожалуйста, свой новый аккаунт!\nВведите Login:"
    )
    val loginNewUser = readln()
    println("Введите пароль:")
    val passwordNewUser = readln()
    println("Повторите введенный пароль:")
    var passwordConfirmation = readln()

    while (passwordNewUser != passwordConfirmation) {
        println(
            "Значение пароля не совпали.\nПовторите ввод"
        )
        passwordConfirmation = readln()
    }
    println("Ваш аккаунт зарегистрирован.")
    Thread.sleep(2000)

    println(
        "\nАвторизация пользователя\nВведите логин:"
    )
    var loginUser = readln()
    while (loginUser != loginNewUser) {
        println(
            "Такой пользователь не зарегистрирован.\nВведите логин снова."
        )
        loginUser = readln()
    }
    println("Введите пароль:")
    var passwordUser = readln()
    while (passwordUser != passwordNewUser) {
        println(
            "Пароль не верен.\nВведите пароль снова."
        )
        passwordUser = readln()
    }
    println("\n Авторизация успешна!")
}