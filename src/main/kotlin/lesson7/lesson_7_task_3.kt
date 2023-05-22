package lesson7

// ... ни чего не приходит в голову ...
fun main() {
    println("Введите число от 2 до 20:")
    var numEndProgression = readln().toIntOrNull() ?: 0

    while (numEndProgression !in (2..20)) {
        println("Для особенных повторяю:\n\"ВВЕДИ ЧИСЛО от 2 до 20\". Попробуй снова:")
        numEndProgression = readln().toIntOrNull() ?: 0
    }

    for (i in 2..numEndProgression step 2) println("Число четной прогрессии $i")
}