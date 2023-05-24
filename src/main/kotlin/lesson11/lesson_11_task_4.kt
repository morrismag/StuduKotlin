package lesson11

// ... пока не разобрался как сделать правильно присоединенные подконтакты ...

class Contact(
    val id: Int,
    val nameContact: String,
    val telNumberSell: Long,
    val telNumberHome: Long,
    val accFaceTime: String,
    val iCloud: String,
    var subContact: String,
    var attachedContacts: Array<String> = arrayOf()
) {
    fun writingSend() {
        println("Эта функция для написания СМС")
    }

    fun telSell() {
        println("Эта функция для звонка")
    }

    fun telVideoSell() {
        println("Эта функция для видеозвонка")
    }

    fun emailSend() {
        println("Эта функция для отправке сообщения по e-mail")
    }

    fun sellFaceTime() {
        println("Эта функция для звонка по FaceTime")
    }

    fun sellVideoFaceTime() {
        println("Эта функция для видео по FaceTime")
    }

    fun subContactLink() {
        println("Эта функция должна подсоединять подконтакты в attachedContacts")
    }
}

fun main() {
    val contact = Contact(
        1,
        "Max",
        89564326754,
        89786543421,
        "Morris",
        "mo@mail.ru",
        "муж",
        arrayOf("жена", "Оля", "подруга", "Галя", " подруга", "Света"),
    )

    println(contact.id)
    println(contact.nameContact)
    println(contact.telNumberSell)
    println(contact.telNumberHome)
    println(contact.accFaceTime)
    println(contact.iCloud)
    println(contact.subContact)
    for (i in contact.attachedContacts.indices) {
        println(contact.attachedContacts[i])
    }

    contact.writingSend()
    contact.telSell()
    contact.telVideoSell()
    contact.emailSend()
    contact.sellFaceTime()
    contact.sellVideoFaceTime()
    contact.subContactLink()
}