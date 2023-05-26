package lesson10

fun main() {
    println("Для регистрации на портале введите логин (не менее 4-х символов):")
    val loginUserEnter = cycleEnterLogin()
    println("\nВведите новый пароль (не менее 4-х символов):")
    val passwordUser = cycleEnterPassword()
    println("Ваш логин \"$loginUserEnter\", пароль \"$passwordUser\"")
}

fun checkEnter(enter: String): Boolean {
    return enter.length >= 4
}

fun cycleEnterLogin(): String {
    var loginUserEnter = readln()

    while (!checkEnter(loginUserEnter)) {
        println("НЕ МЕНЕЕ это больше или равно четырех символов! Вводи:")
        loginUserEnter = readln()
    }

    return loginUserEnter
}

fun cycleEnterPassword(): String {
    var passwordUser = readln()

    while (!checkEnter(passwordUser)) {
        println("НЕ МЕНЕЕ это больше или равно четырех символов! Вводи:")
        passwordUser = readln()
    }

    return passwordUser
}
