package lesson6

fun main() {
    println(
        "Введите количество от 1 до 10:\n" +
                "По истечению этого времени на экране появится надпись."
    )
    var secNumber = readln().toInt()
    while (secNumber > 0) {
        println("Осталось секунд: $secNumber")
        secNumber--
        Thread.sleep(1000)
    }
    println("\nВремя вышло")
}