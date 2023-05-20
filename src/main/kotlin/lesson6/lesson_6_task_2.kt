package lesson6
// ... не думай о секундах с высока ...
fun main() {
    println(
        "Введите количество от 1 до 10:\n" +
                "По истечению этого времени на экране появится надпись."
    )
    val secNumber = readln().toInt()
    var index = secNumber
    while (index > 0) {
        index--
        Thread.sleep(1000)
    }
    println(" Прошло $secNumber секунд.")
}