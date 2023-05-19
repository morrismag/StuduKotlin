package lesson7

// ... режь красный провод.
// Но в фильмах же синий.
// Синий я уже перерезал. Режь гово...БУММММ!!! ...
fun main() {
    println("Введите кол-во секунд от 1 до 20:")
    var secondQuantity = readln().toIntOrNull()
    while (secondQuantity !in (1..20)) {
        println("Ну тебя же попросили ввести число от 1 до 20. Попробуй снова:")
        secondQuantity = readln().toIntOrNull()
    }
    for (i in secondQuantity!! downTo 0) {
        // Иван объясни вкраце почему secondQuantity!! работает,а без него нет, т.е что "!!" означает
        println("Осталось $i секунд.")
        Thread.sleep(1000)
    }
    println("Время вышло. БУМ!!!")
}