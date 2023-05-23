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