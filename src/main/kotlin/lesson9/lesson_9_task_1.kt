package lesson9
// ... салат - утренняя свеЖесть ...
fun main() {
    val ingredientsList = listOf("Помидор", "Огурец", "Лук", "Масло")
    println("В рецепте есть следующие ингридиенты:")
    ingredientsList.forEach {
        println(it)
    }
}