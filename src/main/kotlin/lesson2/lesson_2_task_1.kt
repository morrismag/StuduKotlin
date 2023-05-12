package lesson2

// ... London is the capital of Great Britain ...
fun main() {
    val balFirstStudent = 3
    val balSecondStudent = 4
    val balThirdStudent = 3
    val balFourthStudent = 5
    var resultNew: Float = 0.0f

    resultNew = (balFirstStudent + balSecondStudent + balThirdStudent + balFourthStudent).toFloat() / 2

    println("Результат: ${String.format("%.2f", resultNew)}")
}