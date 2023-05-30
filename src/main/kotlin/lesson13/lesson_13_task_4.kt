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
                    "Компания: ${companyName ?: "[не указано]"}\n"
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
    var userName: String
    var userTelephone: Int
    var userCompany: String
    println("Введите имя аббонента:")
    userName = readln()
    if (userName == "") userName = "null"
    println("Введите номер телефона:")
    userTelephone = (readln().toLongOrNull() ?: 0).toInt()
    println("Введите компанию абонента")
    userCompany = readln()
    if (userCompany == "") userCompany = "null"

    while (userTelephone == 0) {
        println("Ты не ввел номер телефона, повторить добавление контакта.")
        println("Введите имя аббонента:")
        userName = readln()
        if (userName == "") userName = "null"
        println("Введите номер телефона:")
        userTelephone = (readln().toLongOrNull() ?: 0).toInt()
        println("Введите компанию абонента")
        userCompany = readln()
        if (userCompany == "") userCompany = "null"
    }
    return UserInDirectory(
        userName,
        userTelephone,
        userCompany
    )
}
