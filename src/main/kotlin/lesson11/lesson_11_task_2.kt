package lesson11

class User2(
    private val idUser: String,
    var loginUser: String,
    var passwordUser: String,
    var emailUser: String,
    var bio: String = "",
) {
    fun readInformation() {
        println("Измененные данные о пользователе $loginUser")
        println(idUser)
        println(loginUser)
        println(passwordUser)
        println(emailUser)
        println(bio)
    }

    fun rewriteBio() {
        println("Введите  УТОЧНЕННУЮ информацию о пользователе")
        bio = readln()
    }

    fun rePassword() {
        println("Измените пароль. Введите старый пароль:")
        var oldPassword = readln()

        while (oldPassword != passwordUser) {
            println("Пароль неверен. Введите снова:")
            oldPassword = readln()
        }

        println("Введите новый пароль:")
        passwordUser = readln()
    }

    fun sendEmail() {
        println("Введите сообщение пользователю для отправки по e-mail:")
        val sendString = readln()
        println("Сообщение \n$sendString\nотправляем на почту $emailUser")
    }
}
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