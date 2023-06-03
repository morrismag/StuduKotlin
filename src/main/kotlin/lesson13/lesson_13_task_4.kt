package lesson13

class UserInDirectory(
    val userName: String?,
    val telephoneNumber: Int,
    val companyName: String?,
) {
    fun readInformationAboutUser() {
        println(
            "Имя: $userName\n" +
                    "Номер: $telephoneNumber\n" +
                    "Компания: $companyName\n"
        )
    }
}

fun main() {

    println("Новый аббонент")
    val listUser = mutableListOf<UserInDirectory>()
    createUser().let { listUser.add(it) }

    println("Вы хотите ввести нового абонента:")
    var answerUser = readln()

    while (answerUser == "да") {
        createUser().let { listUser.add(it) }
        println("Вы хотите ввести нового абонента:")
        answerUser = readln()
    }

    for (i in listUser.indices) {
        listUser[i].readInformationAboutUser()
    }
}

fun createUser(): UserInDirectory {
    var userName: String?
    var userTelephone: Int
    var userCompany: String?

    println("Введите имя аббонента:")
    userName = readln()
    if (userName.isEmpty()) userName = null
    println("Введите номер телефона:")
    userTelephone = readln().toIntOrNull() ?: 0
    println("Введите компанию абонента")
    userCompany = readln()
    if (userCompany.isEmpty()) userCompany = null

    while (userTelephone == 0) {
        println("Ты не ввел номер телефона, повторить добавление контакта.")
        println("Введите имя аббонента:")
        userName = readln()
        if (userName.isEmpty()) userName = null
        println("Введите номер телефона:")
        userTelephone = readln().toIntOrNull() ?: 0
        println("Введите компанию абонента")
        userCompany = readln()
        if (userCompany.isEmpty()) userCompany = null
    }

    return UserInDirectory(
        userName,
        userTelephone,
        userCompany
    )
}
