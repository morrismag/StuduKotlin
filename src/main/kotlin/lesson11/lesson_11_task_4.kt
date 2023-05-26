package lesson11

class SubContactUser(
    val subId: Int,
    val categoryUser: String,
    val nameSubContact: String,
    val telSubNumberSell: Long,
)

class Contact(
    val id: Int,
    val nameContact: String,
    val telNumberSell: Long,
    val telNumberHome: Long,
    val accFaceTime: String,
    val iCloud: String,
    var attachedContacts: MutableList<SubContactUser>,
) {
    fun writingSend(): String {
        println("Эта функция для написания СМС")
        return readln()
    }

    fun telSell(): Int {
        println("Эта функция для звонка.  Введи номер телефона:")
        return readln().toIntOrNull() ?: 0
    }

    fun telVideoSell(): String {
        println("Эта функция для видеозвонка. Введи аккаунт:")
        return readln()
    }

    fun emailSend(): String {
        println("Эта функция для отправке сообщения по e-mai. Введи e-mail:")
        return readln()
    }

    fun sellFaceTime() {
        println("Эта функция для звонка по FaceTime")
    }

    fun sellVideoFaceTime() {
        println("Эта функция для видео по FaceTime")
    }
}

fun main() {
    val subUserValeriy = SubContactUser(
        1,
        "подруга",
        "Валерия",
        89765436723,
    )
    val subUserSergei = SubContactUser(
        1,
        " друг",
        "Сергей",
        89754326723,
    )

    val listUser = mutableListOf(subUserValeriy, subUserSergei)

    val contact = Contact(
        1,
        "Max",
        89564326754,
        89786543421,
        "Morris",
        "mo@mail.ru",
        attachedContacts = listUser,
    )

    println(contact.id)
    println(contact.nameContact)
    println(contact.telNumberSell)
    println(contact.telNumberHome)
    println(contact.accFaceTime)
    println(contact.iCloud)
    for (i in contact.attachedContacts.indices) {
        println(contact.attachedContacts[i].nameSubContact)
        println(contact.attachedContacts[i].categoryUser)
    }

    println(contact.writingSend())
    println(contact.telSell())
    println(contact.telVideoSell())
    println(contact.emailSend())
    contact.sellFaceTime()
    contact.sellVideoFaceTime()
}