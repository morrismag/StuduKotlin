package lesson10

fun main() {
    println("Для регистрации придумайте логин не менее 4-х символов:")
    var loginUser = readln()

    while (!checkEnter(loginUser)) {
        loginUser = readln()
    }

    val passwordUser = generationPassword(8)
    println("Для вас сгенерирован новый пароль:$passwordUser")
    println("\nАвторизуйтесь пожалуйста.\nВведите логин:")
    var loginUserEnter = readln()
    println("Введите пароль:")
    var passwordUserEnter = readln()

    while (!checkLoginPasswordEnter(loginUser, passwordUser, loginUserEnter, passwordUserEnter)) {
        println("Введите снова логин:")
        loginUserEnter = readln()
        println("Введите снова пароль:")
        passwordUserEnter = readln()
    }

    var codeAuthorization = (1000..9999).random().toString()
    println("Вам выслан код авторизации: $codeAuthorization")
    println("Введите код авторизации:")
    var codeAuthorizationEnter = readln()

    while (!checkCode(codeAuthorization, codeAuthorizationEnter)) {
        codeAuthorization = (1000..9999).random().toString()
        println("Вам повторно выслан код авторизации: $codeAuthorization")
        codeAuthorizationEnter = readln()
    }
}

fun checkEnter(enter: String): Boolean {
    val result = if (enter.length >= 4) {
        println("Логин принят.")
        true
    } else {
        println("Значение меньше 4-х символов. Введите снова:")
        false
    }
    return result
}

fun generationPassword(numberOfPassword: Int): String {
    val numPart = (1..9).toList()
    val randomChars = ('1'..'9') + ('a'..'z') + ('A'..'Z') +
            (33..47).toList().map { it.toChar() }
    val resultPassword: Array<String> = Array(numberOfPassword) { "" }

    for (i in 0 until numberOfPassword) {
        if ((i % 2) != 0) {
            resultPassword[i] = randomChars.random().toString()
        } else resultPassword[i] = numPart.random().toString()
    }
    return resultPassword.joinToString("")
}

fun checkLoginPasswordEnter(login: String, password: String, loginEnter: String, passwordEnter: String): Boolean {
    val result =
        if ((login == loginEnter) && (password == passwordEnter)) {
            println("Авторизация пройдена успешно!")
            true
        } else {
            println("Вы неправильно ввели или логин или пароль. Введите снова:")
            false
        }
    return result
}

fun checkCode(code: String, codeEnter: String): Boolean {
    val result = if (code == codeEnter) {
        println("Ура. Вы наконец авторизовались!!!")
        true
    } else {
        false
    }
    return result
}