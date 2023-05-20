package lesson8

// ... признаюсь меня эта задача ввела в глубокие размышления
// Вариант, который я сделал, не масштабируемый...
fun main() {
    val ingredientsList: Array<String> = arrayOf("соль", "варенье", "лавровый лист", "пельмени", "кетчуп")
    println("Какой ингридиент Вас интересует:")
    val userIngr = readln()
    val resultArray: BooleanArray = booleanArrayOf(false, false, false, false, false)
    for (i in ingredientsList.indices) {
        resultArray[i] = (userIngr == ingredientsList[i])
    }
    if (true in resultArray) println("Ингридиент \"$userIngr\" в рецепте есть")
    else println("Такого ингридиента в рецепте нет")
}