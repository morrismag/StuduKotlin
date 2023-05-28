package lesson13

class UserInDirectory(
    val userName: String?,
    val telephoneNumber: Long,
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

    val listUserFilter = listUser.filter { it.telephoneNumber.toInt() != 0 }

    for (i in listUserFilter.indices) {
        listUserFilter[i].readInformationAboutUser()
    }
}

fun addUser(): UserInDirectory {
    println("Введите имя аббонента:")
    val userName = readln()
    println("Введите номер телефона:")
    val userTelephone = readln().toLongOrNull() ?: 0
    println("Введите компанию абонента")
    val userCompany = readln()
    return UserInDirectory(
        userName,
        userTelephone,
        userCompany
    )
}
