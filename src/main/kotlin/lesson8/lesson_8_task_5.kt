package lesson8

// ... признаюсь, многое мне помог компилятор ...
fun main() {
    println("Введи число ингридиентов. До 5 иначе много печатать:")
    var quantityIngredients = readln().toIntOrNull()
    while (quantityIngredients !in (1..5)) {
        println("Ну тебя же попросили ввести число от 1 до 5. Попробуй снова:")
        quantityIngredients = readln().toIntOrNull()
    }

    val arrayIngredients = quantityIngredients?.let { arrayOfNulls<String>(it) }
    var userIngredient: String
    for (i in 1..quantityIngredients!!) {
        println("Введите $i-й ингридиент: ")
        userIngredient = readln()
        arrayIngredients?.set(i - 1, userIngredient)
    }
    if (arrayIngredients != null) {
        println(
            "Вот что получилось:" +
                    "[${arrayIngredients.joinToString("; ")}]"
        )
    }
}