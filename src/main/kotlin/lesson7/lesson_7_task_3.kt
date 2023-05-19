package lesson7

// ... ни чего не приходит в голову ...
fun main() {
    println("Введите число от 2 до 20:")
    val numEndProgression = readln().toInt()
    val progressionResult = 0..numEndProgression step (2)
    for (i in progressionResult) println("Число четной прогрессии $i")
}