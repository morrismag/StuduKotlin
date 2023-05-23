package lesson11

// ... пока не разобрался как сделать правильно присоединенные подконтакты ...
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