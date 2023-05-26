package lesson14

open class MessageAuthor(
    val nameAuthor: String,
    val messageAuthor: String,
) {
    fun createMessage(name: String, message: String) {
        println(
            "{$name}\n" +
                    "     {$message}"
        )
    }
}

class CommentUser(
    nameAuthor: String,
    message: String,
    val nameUser: String,
    val messageUser: String,
) {
    fun createAnswer(nameAuthor: String, messageAuthor: String, nameUser: String, messageUser: String) {
        println(
            "{$nameUser}\n" +
                    "     {$messageUser}\n" +
                    "                   -$nameAuthor-\n" +
                    "                   -$messageAuthor-}"
        )
    }
}

fun main() {

    println("Введите ник для публикации сообщения")
    val nameAuthor = checkNameAuthorUser(readln())
    println("Введи сообщение:")
    val messageAuthor = checkMessage(readln())
    val messageOne = MessageAuthor(
        nameAuthor,
        messageAuthor
    )

    println("Введите ник для ответного сообщения")
    val nameUser = checkNameAuthorUser(readln())
    println("Введи сообщение:")
    val messageUser = checkMessage(readln())
    val answerOne = CommentUser(
        nameAuthor,
        messageAuthor,
        nameUser,
        messageUser
    )

    messageOne.createMessage(nameAuthor, messageAuthor)
    Thread.sleep(2000)
    answerOne.createAnswer(nameAuthor, messageAuthor, nameUser, messageUser)
}

fun checkNameAuthorUser(name: String): String {
    var nameCheck = name
    while (nameCheck == "") {
        println("Публиковать сообщение от неизвестного кого не буду! Введи ник:")
        nameCheck = readln()
    }
    return nameCheck
}

fun checkMessage(message: String): String {
    var messageCheck = message
    while (messageCheck == "") {
        println("Публиковать пустоту нет смысла!!! Соберись с мыслями и давай уже печатай:")
        messageCheck = readln()
    }
    return messageCheck
}
