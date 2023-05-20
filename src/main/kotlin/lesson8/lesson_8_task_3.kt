package lesson8

// ... этот ход решения на порядок проще чем через цикл ...
fun main() {
    val ingredientsList: Array<String> = arrayOf("соль", "варенье", "лавровый лист", "пельмени", "кетчуп")
    println("Какой ингридиент Вас интересует:")
    val userIngr = readln()
    if (userIngr in ingredientsList) println("Ингридиент \"$userIngr\" в рецепте есть")
    else println("Такого ингридиента в рецепте нет")
}
