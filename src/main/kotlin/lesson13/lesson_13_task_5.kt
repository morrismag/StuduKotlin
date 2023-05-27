package lesson13

fun main() {
    println("Введи число:")
    try {
        val number: Long
        val strNumber = readlnOrNull().toString()
        number = strNumber.toLong()
    }
    catch (e: Exception){
        println("Опаньки. А незя буквы в цифры переделывать!!!")
        println(e.message)
    }
}