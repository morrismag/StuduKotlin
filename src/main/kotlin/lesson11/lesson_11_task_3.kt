package lesson11

// ... не совсем понял задание...
fun main() {
    val roomOne = Room(
        1,
        "URL1",
        "Разговоры о машинах",
        usersRoom = arrayOf("Serj", "Alex", "Max")
    )
    val roomTwo = Room(
        2,
        "URL2",
        "Разговоры о рыбалке",
        usersRoom = arrayOf("Serj", "Max")
    )

    val serjUser = User(
        1,
        "url_user1",
        "Serjik",
        "Serj",
        "Разговаривает",
    )
    val alexUser = User(
        2,
        "url_user2",
        "Alexey",
        "Alex",
    )
    val maxUser = User(
        3,
        "url_user3",
        "Max",
        "Max",
        "пользователь заглушен",
    )
}