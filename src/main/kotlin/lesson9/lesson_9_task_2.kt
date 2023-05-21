package lesson9

import kotlin.system.exitProcess

fun main() {
    val ingredientsList = mutableListOf("Авокадо", "Манго", "Кокос")
    println("В рецепте есть базовые ингредиенты:")

    ingredientsList.forEach {
        println(it)
    }

    println("Желаете добавить еще? (ответ да/нет)")
    val answer = readln()

    if (answer != "да") exitProcess(0)
    else println("Какой ингредиент вы хотите добавить?")

    val addIngredient = readln()
    ingredientsList.add(addIngredient)
    println("Теперь в рецепте есть следующие ингредиенты:")

    ingredientsList.forEach {
        println(it)
    }
}