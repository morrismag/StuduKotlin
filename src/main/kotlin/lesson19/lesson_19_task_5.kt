package lesson19

class User(
    var nameUser: String,
    var genderUser: String,
)

fun main() {
    println(
        "Уважаемый человек!\n" +
                "Для корректной работы \"Картотеки\" имя пользователя вводится с заглавной буквы (например: Сергей).\n" +
                "Пол пользователя вводите только \"MAN\" или \"WOMAN\"."
    )
    val listUser: MutableList<User> = mutableListOf()
    for (i in 0..4) {
        println("Введите имя следующего пользователя:")
        var uName = readln()
        while (uName == "") {
            println("Вы не ввели имя пользователя. Введите имя пользователя:")
            uName = readln()
        }
        println("Введите пол пользователя:")
        var uGender = readln()
        while (uGender !in listOf(Gender.MAN.name, Gender.WOMAN.name)) {
            println(
                "Уважаемый! Учите мат часть! Не фиг спорить с природой!\n" +
                        "Введи один из двух естественных полов:"
            )
            uGender = readln()
        }
        // val user = User(uName,uGender)
        listUser.add(i, createCardUser(uName, uGender))
    }
    listUser.forEach {
        println()
        println(it.nameUser)
        println(it.genderUser)

    }
}

enum class Gender {
    MAN,
    WOMAN,
}

fun createCardUser(nameUser: String, genderUser: String): User {
    return User(nameUser, genderUser)
}
