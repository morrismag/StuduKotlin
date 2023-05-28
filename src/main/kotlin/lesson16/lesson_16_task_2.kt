package lesson16

class Circle() {
    private var radius: Int = 0

    fun setRadius(inputRadius: Int) {
        radius = inputRadius
    }

    fun perimeter() {
        println("Периметр круга равен ${2 * PI * radius}")
    }

    fun square() {
        println("Площадь круга равен ${PI * radius * radius}")
    }
}

fun main() {
    val circle = Circle()
    println("Введи радиус:")
    val inputRadius = readln().toIntOrNull() ?: 0
    circle.setRadius(inputRadius)
    circle.perimeter()
    circle.square()
}

const val PI = 3.14