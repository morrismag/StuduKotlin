package lesson11

class User(
    val id: Int,
    val imgUser: String,
    val nikNameUser: String,
    val badgeUser: String,
    var statusUser: String = "Микрофон выключен"
) {
}