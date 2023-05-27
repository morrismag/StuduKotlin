package lesson13

class UserCard(
    val userName: String,
    val telephoneNumber: Long,
    val companyName: String?,
) {
    fun readInformationAboutUser() {
        println(
            "Имя: $userName\n" +
                    "Номер: $telephoneNumber\n" +
                    "Компания: " +
                    "${companyName ?: "[не указано]"}\n"
        )
    }
}

fun main() {
    val listUser = mutableListOf<UserCard>()

    val user1 = UserCard(
        "Alex",
        89256789432,
        null
    )
    val user2 = UserCard(
        "Boris",
        89256659720,
        "LANIT"
    )
    val user3 = UserCard(
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