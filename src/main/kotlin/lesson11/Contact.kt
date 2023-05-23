package lesson11

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
