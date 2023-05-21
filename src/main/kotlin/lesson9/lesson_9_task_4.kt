package lesson9
 // ... намучился с функцией sort ...
fun main() {
    print("Введите, пожалуйста, пять ингридиентов через запятую:\n")
    val stringIngredients = readln()
    val listIngredients = stringIngredients.split(",").toMutableList()
    listIngredients.sort()
    println(listIngredients)
}