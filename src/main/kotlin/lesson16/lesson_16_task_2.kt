package lesson16

import kotlin.math.pow

class Circle() {
    private var radius: Double = 0.0

    fun setRadius(inputRadius: Int) {
        radius = inputRadius.toDouble()
    }

    fun perimeterCircle() {
        println("Периметр круга равен ${2 * PI * radius}")
    }

    fun squareCircle() {
        println("Площадь круга равен ${PI * radius.pow(2.0)}")
    }
}

fun main() {
    val circle = Circle()
    println("Введи радиус:")
    val inputRadius = readln().toIntOrNull() ?: 0
    circle.setRadius(inputRadius)
    circle.perimeterCircle()
    circle.squareCircle()
}

const val PI = 3.14