package lesson20

fun main() {
    val listString = listOf("1", "2", "3", "4", "5", "6", "7")
    val listLambda = mutableListOf(listString.map {
        if (listString.indexOf(it) % 2 != 0) {
            println("Нажат элемент $it")
        } else {
            println(it)
        }
    }
    )
    listLambda.forEach { _ -> }
}