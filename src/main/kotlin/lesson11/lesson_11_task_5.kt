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

    fun newUser(): User {
        ++lastUserId
        println("Введи нового пользователя:")
        val nameUser = readln()
        return User(idUser = lastUserId, nameUser)
    }

    fun newMessage(user: User): Message {
        user.messageId++
        println("Введи сообщение от ${user.loginUser}:")
        val messageUser = readln()
        return Message(idMessage = user.messageId, authorId = user.idUser, messageUser = messageUser)
    }

    fun printThread(user: User, message: Message) {
        println(user.loginUser + ":" + message.messageUser)
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.newUser()
    val user2 = forum.newUser()
    val message1User1 = forum.newMessage(user1)
    val message2User1 = forum.newMessage(user1)
    val message1User2 = forum.newMessage(user2)
    val message2User2 = forum.newMessage(user2)

    forum.printThread(user1, message1User1)
    forum.printThread(user1, message2User1)
    forum.printThread(user2, message1User2)
    forum.printThread(user2, message2User2)
}