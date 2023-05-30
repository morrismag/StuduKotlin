package lesson18

open class Product {
    open fun getOrder() = ""
}

class OneProductInOrder(
    private val idOrder: Int,
    private val productInOrder: String,
) : Product() {
    override fun getOrder(): String {
        return "Номер заказа $idOrder\nЗаказан товар: $productInOrder"
    }
}

class ManyProductInOrder(
    private val idOrder: Int,
    private val productInOrder: List<String>,
) : Product() {
    override fun getOrder(): String {
        return "Номер заказа $idOrder\nЗаказаны следующие товары: $productInOrder"
    }
}

fun main() {
    val messageOneProduct = OneProductInOrder(
        1,
        "сосиски"
    )
    val messageManyProduct = ManyProductInOrder(
        2,
        listOf("колбаса", "молоко", "чипсы")
    )

    println(messageOneProduct.getOrder())
    println()
    println(messageManyProduct.getOrder())
}