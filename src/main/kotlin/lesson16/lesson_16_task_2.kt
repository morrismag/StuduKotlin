package lesson16

import kotlin.math.pow

class Circle() {
    private var radius: Double = 0.0

    fun calculateRadius(inputRadius: Int) {
        radius = inputRadius.toDouble()
    }

    fun calculatePerimeterCircle() {
        println("Периметр круга равен ${2 * PI * radius}")
    }

    fun calculateSquareCircle() {
        println("Площадь круга равен ${PI * radius.pow(2.0)}")
    }
}

fun main() {
    val circle = Circle()
    println("Введи радиус:")
    val inputRadius = readln().toIntOrNull() ?: 0
    circle.calculateRadius(inputRadius)
    circle.calculatePerimeterCircle()
    circle.calculateSquareCircle()
}

const val PI = 3.14