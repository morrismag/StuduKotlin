package lesson16

class Order {
    private val idOrder: Int = 0
    private var statusOrder: String = "Не обработан"

    private fun changeStatus(inputChange: String) {
        statusOrder = inputChange
    }

    fun inputStatusMassage() {
        println("Отправь статус заказа:")
        val inputChange = readln()
        changeStatus(inputChange)
    }

    fun viewingStatus() {
        println("Статус заказа изменен на $statusOrder")
    }
}

fun main() {
    val order = Order()
    order.inputStatusMassage()
    order.viewingStatus()
}