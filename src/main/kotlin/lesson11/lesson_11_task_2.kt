package lesson11

fun main() {

    println("Уважаемый пользователь введите данные о себе:\nВведите №:")
    val idUser = readln()
    println("Введите логин:")
    val loginUser = readln()
    println("Введите пароль:")
    val passwordUser = readln()
    println("Введите e-mail:")
    val emailUser = readln()

    val firstUser = User2(
        idUser,
        loginUser,
        passwordUser,
        emailUser,
    )

    firstUser.readInformation()
    firstUser.rewriteBio()
    firstUser.readInformation()
    firstUser.rePassword()
    firstUser.readInformation()
    firstUser.sendEmail()
}