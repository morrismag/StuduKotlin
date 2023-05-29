package lesson13

class UserTelephone1(
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
    val firstUser = UserTelephone1(
        "Alex",
        89256789432,
        null
    )

    firstUser.readInformationAboutUser()
}