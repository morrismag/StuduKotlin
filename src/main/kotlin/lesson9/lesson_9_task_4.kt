package lesson9

fun main() {
    print("Введите, пожалуйста, пять ингридиентов через запятую:\n")
    val stringIngredients = readln()
    val listIngredients: List<String> = stringIngredients.split(",")
     println(listIngredients.sorted())
}