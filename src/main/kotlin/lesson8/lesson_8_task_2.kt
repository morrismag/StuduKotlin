package lesson8

// ... признаюсь меня эта задача ввела в глубокие размышления
// Вариант, который я сделал, не масштабируемый...

fun main() {
    val ingredientsList: Array<String> = arrayOf("соль", "варенье", "лавровый лист", "пельмени", "кетчуп")
    println("Какой ингредиент Вас интересует:")
    val userIngr = readln()
    var flag = false

    for (i in ingredientsList.indices) {
        if (userIngr == ingredientsList[i]) {
            println("Ингредиент \"$userIngr\" в рецепте есть.")
            flag = true
            break
        }
    }

    if (!flag) println("Такого ингредиента \"$userIngr\" в рецепте нет")
}