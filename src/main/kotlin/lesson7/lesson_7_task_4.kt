package lesson7

// ... на сегоднешнем уровне я пока не могу вменяемую обработку ошибок написать, если введен текст или ничего,
// если не буду ипользовать !!...
fun main() {
    println("Введите кол-во секунд от 1 до 20:")
    var secondQuantity = readln().toInt()

    while (secondQuantity !in (1..20)) {
        println("Ну тебя же попросили ввести число от 1 до 20. Попробуй снова:")
        secondQuantity = readln().toInt()
    }

    for (i in secondQuantity downTo 1) {
        println("Осталось $i секунд.")
        Thread.sleep(1000)
    }
    println("Время вышло. БУМ!!!")
}