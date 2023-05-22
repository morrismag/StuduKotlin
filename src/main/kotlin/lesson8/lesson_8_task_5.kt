package lesson8

fun main() {
    println("Введи число ингридиентов. До 5 иначе много печатать:")
    var quantityIngredients = readln().toIntOrNull() ?: 0

    while (quantityIngredients !in (1..5)) {
        println("Ну тебя же попросили ввести число от 1 до 5. Попробуй снова:")
        quantityIngredients = readln().toIntOrNull() ?: 0
    }

    val arrayIngredients = arrayOfNulls<String>(quantityIngredients)
    var userIngredient: String

    for (i in 1..quantityIngredients) {
        println("Введите $i-й ингридиент: ")
        userIngredient = readln()
        arrayIngredients[i - 1] = userIngredient
    }

    println(
        "Вот что получилось: [${arrayIngredients.joinToString(", ")}]"
    )
}