package lesson10

fun main() {
    println("Для регистрации на портале введите логин (не менее 4-х символов):")
    var loginUserEnter = readln()

    while (checkEnter(loginUserEnter) == 0) {
        loginUserEnter = readln()
    }

    println("\nВведите новый пароль (не менне 4-х символов):")
    var passwordUser = readln()

    while (checkEnter(passwordUser) == 0) {
        passwordUser = readln()
    }

    println("Ваш логин \"$loginUserEnter\", пароль \"$passwordUser\"")
}

fun checkEnter(enter: String): Int {
    val result = if (enter.length > 4) {
        println("Допустимое значение.")
        1
    } else {
        println("Значение меньше 4-х символов. Введите снова:")
        0
    }
    return result
}
