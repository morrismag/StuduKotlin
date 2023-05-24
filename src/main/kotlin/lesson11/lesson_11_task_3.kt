package lesson11

// ... не совсем понял задание...

class Room3(
    val id: Int,
    val imgRoom: String,
    val nameRoom: String,
    val usersRoom: Array<String>
) {
}

class User3(
    val id: Int,
    val imgUser: String,
    val nikNameUser: String,
    val badgeUser: String,
    var statusUser: String = "Микрофон выключен"
) {
}

fun main() {
    val roomOne = Room3(
        1,
        "URL1",
        "Разговоры о машинах",
        usersRoom = arrayOf("Serj", "Alex", "Max")
    )
    val roomTwo = Room3(
        2,
        "URL2",
        "Разговоры о рыбалке",
        usersRoom = arrayOf("Serj", "Max")
    )

    val serjUser = User3(
        1,
        "url_user1",
        "Serjik",
        "Serj",
        "Разговаривает",
    )
    val alexUser = User3(
        2,
        "url_user2",
        "Alexey",
        "Alex",
    )
    val maxUser = User3(
        3,
        "url_user3",
        "Max",
        "Max",
        "пользователь заглушен",
    )
}