package lesson13

class UserInDirectory(
    val userName: String?,
    val telephoneNumber: Long,
    val companyName: String?,
) {
    fun readInformationAboutUser() {
        println(
            "Имя: " +
                    "${
                        if (userName.isNullOrEmpty()) {
                            null
                        } else userName
                    }\n" +
                    "Номер: $telephoneNumber\n" +
                    "Компания: " +
                    "${
                        if (companyName.isNullOrEmpty()) {
                            null
                        } else companyName
                    }\n"
        )
    }
}

fun main() {

    println("Новый аббонент")
    var index = 0
    val listUser = mutableListOf<UserInDirectory>()
    listUser.add(index, addUser())

    println("Вы хотите ввести нового абонента:")
    var answerUser = readln()

    while (answerUser == "да") {
        index++
        listUser.add(index, addUser())
        println("Вы хотите ввести нового абонента:")
        answerUser = readln()
    }

    for (i in 0 until listUser.size) {
        listUser[i].readInformationAboutUser()
    }
}

fun addUser(): UserInDirectory {
    println("Введите имя аббонента:")
    val userName = readln()
    println("Введите номер телефона:")
    var userTelephone = readln().toLongOrNull() ?: 0

    while (userTelephone.toInt() == 0) {
        println("Вы не ввели номер телефона. Повторите ввод:")
        userTelephone = readln().toLongOrNull() ?: 0
    }

    println("Введите компанию абонента")
    val userCompany = readln()

    return UserInDirectory(
        userName,
        userTelephone,
        userCompany
    )
}
