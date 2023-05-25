package lesson13

class UserTelephoneCompany(
    val userName: String,
    val telephoneNumber: Long,
    val companyName: String?,
) {
    fun readInformationAboutUser() {
        println(
            "Имя: $userName\n" +
                    "Номер: $telephoneNumber\n" +
                    "Компания: " +
                    "${
                        if (companyName.isNullOrEmpty()) {
                            "[не указано]"
                        } else companyName
                    }\n"
        )
    }
}

fun main() {
    val listUser = mutableListOf<UserTelephoneCompany>()

    val user1 = UserTelephoneCompany(
        "Alex",
        89256789432,
        null
    )
    val user2 = UserTelephoneCompany(
        "Boris",
        89256659720,
        "LANIT"
    )
    val user3 = UserTelephoneCompany(
        "Alex",
        89016754589,
        "Yandex"
    )

    listUser.add(0, user1)
    listUser.add(1, user2)
    listUser.add(2, user3)

    for (i in 0 until listUser.size) {
        listUser[i].readInformationAboutUser()
    }
}