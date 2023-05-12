package lesson3

// ... умножение - умно-жить ...

//  Пока не понял как сделать, если не ввести число,
//  что бы повторялась запись пока не введут и программа не завершалась.

fun main() {

    println("Введите число для таблицы умножения и нажмите интер")
    val numberForCalculation: String = readlnOrNull().orEmpty()
    var result = 0

    if (numberForCalculation.isNotEmpty()) {
        for (i in 0..9) {
            result = numberForCalculation.toInt() * i
            println("$numberForCalculation x $i = $result")
        }
    } else {
        println("Вы не ввели ни какого числа. Досвидания.")
    }
}