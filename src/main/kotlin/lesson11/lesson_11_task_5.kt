package lesson11

class User(
    val idUser: Int,
    val loginUser: String,
    var messageId: Int = 0,
)

class Message(
    val idMessage: Int,
    val authorId: Int,
    val messageUser: String,
)

class Forum() {

    var lastUserId = 0

    fun newUser(nameUser: String): User {
        ++lastUserId
        return User(idUser = lastUserId, nameUser)
    }

    fun newMessage(user: User, messageUser: String): Message {
        user.messageId++
        return Message(idMessage = user.messageId, authorId = user.idUser, messageUser = messageUser)
    }

    fun printThread(user: User, message: Message) {
        println(user.loginUser + ":" + message.messageUser)
    }
}

fun main() {
    val forum = Forum()

    println("Введи нового пользователя:")
    var nameUser = readln()
    val user1 = forum.newUser(nameUser)
    println("Введи нового пользователя:")
    nameUser = readln()
    val user2 = forum.newUser(nameUser)

    println("Введи сообщение от ${user1.loginUser}:")
    var messageUser = readln()
    val message1User1 = forum.newMessage(user1, messageUser)

    println("Введи сообщение от ${user1.loginUser}:")
    messageUser = readln()
    val message2User1 = forum.newMessage(user1, messageUser)

    println("Введи сообщение от ${user2.loginUser}:")
    messageUser = readln()
    val message1User2 = forum.newMessage(user2, messageUser)
    println("Введи сообщение от ${user2.loginUser}:")
    messageUser = readln()
    val message2User2 = forum.newMessage(user2, messageUser)

    forum.printThread(user1, message1User1)
    forum.printThread(user1, message2User1)
    forum.printThread(user2, message1User2)
    forum.printThread(user2, message2User2)
}