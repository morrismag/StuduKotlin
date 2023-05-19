package lesson6
// ... тук-тук-тук.
// Кто там?
// Я.
// Входи ...
fun main() {

    println(
        "Уважаемый пользователь, зарегистрируйте, пожалуйста, свой новый аккаунт!\n" +
        "Введите Login:"
    )
    val loginNewUser = readln()
    println("Введите пароль:")
    val passwordNewUser = readln()
    println("Повторите введенный пароль:")
    var passwordConfirmation = readln()

    while (passwordNewUser != passwordConfirmation) {
        println(
            "Значение пароля не совпали.\n" +
                    "Повторите ввод"
        )
        passwordConfirmation = readln()
    }
    println("Ваш аккаунт зарегистрирован.")
    Thread.sleep(2000)

    println(
        "\nАвторизация пользователя\n" +
                "Введите логин:"
    )
    var loginUser = readln()
    while (loginUser != loginNewUser) {
        println(
            "Такой пользователь не зарегистрирован.\n" +
                    "Введите логин снова."
        )
        loginUser = readln()
    }

    println("Введите пароль:")
    var passwordUser = readln()
    while (passwordUser != passwordNewUser) {
        println(
            "Пароль не верен.\n" +
                    "Введите пароль снова."
        )
        passwordUser = readln()
    }
    println("\n Авторизация успешна!")
}