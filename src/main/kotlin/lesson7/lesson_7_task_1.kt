package lesson7

fun main() {
    // по условию нужно каждой строке ниже присвоить переменную а потом в строке их вывести,
    // этот метод короче, но не масштабируемыйю
   /*  println("${(1..9).random()}" +
            "${('a'..'z').random()}" +
            "${(1..9).random()}" +
            "${('a'..'z').random()}" +
            "${(1..9).random()}" +
            "${('a'..'z').random()}") */

    // ниже код мне нравится

    val numS = (1..9)
    val charS = ('a'..'z')
    println("${numS.random()}${charS.random()}" +
            "${numS.random()}${charS.random()}" +
            "${numS.random()}${charS.random()}")


}