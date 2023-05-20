package lesson7

// ... получилось...
fun main() {
    println("Введите кол-во секунд от 1 до 20:")
    var secondQuantity: Int? = readln().toIntOrNull() ?: 0

    while (secondQuantity !in (1..20)) {
        println("Ну тебя же попросили ввести число от 1 до 20. Попробуй снова:")
        secondQuantity = readln().toIntOrNull() ?: 0
    }

    if (secondQuantity != null) {
        for (i in secondQuantity downTo 1) {
            println("Осталось $i секунд.")
            Thread.sleep(1000)
        }
    }
    println("Время вышло. БУМ!!!")
}