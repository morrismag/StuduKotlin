package lesson9

fun main() {
    println("Делаем рецепт.\n Введи пять ингридиентов через Enter:")
    val listIngr = MutableList(5) { checkCreateList() }
    val newList = listIngr.toSet().sorted().toMutableList()
    newList[0] = newList[0].replaceFirstChar { it.uppercaseChar() }
    newList[newList.size - 1] = newList[newList.size - 1] + "."
    println("Мы получили следующий список ингридиентов: ${newList.joinToString(",")}")
}

fun checkCreateList(): String {
    var nameIngredients = readln()

    while (nameIngredients == "") {
        println("Ты не ввел ингредиент. Попробуй снова:")
        nameIngredients = readln()
    }
    return nameIngredients
}