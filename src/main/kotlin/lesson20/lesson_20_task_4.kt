package lesson20

fun main() {
    val listString = listOf("1", "2", "3", "4", "5", "6", "7")
    val listLambda = listString.map { { println("Нажат элемент $it") } }

    for (i in listLambda.indices) if (i % 2 != 0) listLambda[i].invoke()
}