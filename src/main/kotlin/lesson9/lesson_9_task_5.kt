package lesson9

// ... Иван у меня куча вопросов:
// 1. Когда я присваиваю MutableList другой переменной он становится другого типа? Перестают работать
// функции sort и т.д
// 2.какой функцией можно заменить capitalize оптимально, как я сделал или, что то есть покороче?

fun main() {
    println("Делаем рецепт:\nВведи первый ингридиент:")
    val firstIngr = readln()
    println("Введи второй ингридиент:")
    val secondIngr = readln()
    println("Введи третий ингридиент:")
    val thirdIngr = readln()
    println("Введи четвертый ингридиент:")
    val fourthIngr = readln()
    println("Введи пятый ингридиент:")
    val fifthIngr = readln()
    val listIngr: MutableList<String> = mutableListOf(firstIngr, secondIngr, thirdIngr, fourthIngr, fifthIngr)
    val distinctList = listIngr.toSet().toMutableList()
    distinctList.sort()
    distinctList[0] = distinctList[0].replaceFirstChar { it.uppercaseChar() }
    println(distinctList[0])
    val strList = distinctList.joinToString(",")
    println("Мы получили следующий список ингридиентов: $strList.")
}