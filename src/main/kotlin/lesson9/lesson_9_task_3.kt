package lesson9

// ... горшочек вари ...
fun main() {
    val nameIngredients = listOf("Яйцо", "Молоко", "Сливочное масло")
    val onePortionIngredients = listOf(2, 50, 15)
    val changesIngredients = listOf("шт.", "мл.", "гр.")
    println("Сколько порций омлета необходимо готовить:")
    var quantityPortions = readln().toIntOrNull() ?: 0

    while (quantityPortions == 0) {
        println("Введите снова сколько порций омлета необходимо готовить:\"")
        quantityPortions = readln().toIntOrNull() ?: 0
    }

    val manyPortionIngredients = onePortionIngredients.map {
        it * quantityPortions
    }
    println("На $quantityPortions порций вам понадобится:")

    for (i in nameIngredients.indices) {
        println("${nameIngredients[i]} - ${manyPortionIngredients[i]} ${changesIngredients[i]}")
    }
}