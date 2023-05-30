package lesson15

abstract class BaseUser {
    abstract val user: String

    abstract fun readMassage()
    abstract fun writeMassage()
}

class User(override val user: String) : BaseUser() {

    override fun readMassage() {
        println("Я $user читаю сообщения")
    }

    override fun writeMassage() {
        println("Я $user пишу сообщения")
    }
}

class Administrator(override val user: String) : BaseUser() {
    override fun readMassage() {
        println("Я $user читаю сообщения")
    }

    override fun writeMassage() {
        println("Я $user пишу сообщения")
    }

    fun deleteUser() {
        println("Я $user удаляю всяких пользоватетей")
    }

    fun deleteMassage() {
        println("Я $user удаляю всякие мусорные сообщения")
    }
}

fun main() {
    val userInChat = User("пользователь")
    val administratorChat = Administrator("админ")

    userInChat.readMassage()
    userInChat.writeMassage()
    println()
    administratorChat.readMassage()
    administratorChat.writeMassage()
    administratorChat.deleteMassage()
    administratorChat.deleteUser()
}