package lesson11

class User(
    val idUser: Int,
    val loginUser: String,
    val passwordUser: String,
    val emailUser: String,
)

fun main() {
    val userSergey = User(
        1,
        "Sergik",
        "qwe",
        "sergik@ya.ru",
    )
    val userYra = User(
        2,
        "Yra",
        "ewq",
        "yra@ya.ru",
    )
    println(userSergey.idUser)
    println(userSergey.loginUser)
    println(userSergey.passwordUser)
    println(userSergey.emailUser)

    println()

    println(userYra.idUser)
    println(userYra.loginUser)
    println(userYra.passwordUser)
    println(userYra.emailUser)
}

