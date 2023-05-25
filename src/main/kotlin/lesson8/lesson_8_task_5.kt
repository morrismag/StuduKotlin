package lesson8

fun main() {
    val arrayIngr = Array(createArray()) { readln() }
    println(
        "Вот что получилось: [${arrayIngr.joinToString(", ")}]"
    )
}

fun createArray(): Int{
    println("Введи число ингридиентов. До 5 иначе много печатать:")
    var quantityIngredients = readln().toIntOrNull() ?: 0

    while (quantityIngredients !in (1..5)) {
        println("Ну тебя же попросили ввести число от 1 до 5. Попробуй снова:")
        quantityIngredients = readln().toIntOrNull() ?: 0
    }
    println("Введи $quantityIngredients ингредиентов. Отделяй ингредиенты Enter:")
    return quantityIngredients
}