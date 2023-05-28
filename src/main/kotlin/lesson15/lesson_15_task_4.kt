package lesson15

interface Search {
    fun searchParts()
}

abstract class Assortment {
    abstract val nameProduct: String
    abstract val quantityProduct: Int
}

class Instrument(override val nameProduct: String, override val quantityProduct: Int) : Assortment(), Search {
    override fun searchParts() {
        println("Выполняется поиск")
    }
}

class Parts(override val nameProduct: String, override val quantityProduct: Int) : Assortment()

fun main() {
    val violin = Instrument("Скрипка", 5)
    val stringsForViolin = Parts("струны для скрипки", 100)

    violin.searchParts()
}