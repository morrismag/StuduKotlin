package lesson18

import kotlin.math.pow

abstract class Packed {
    abstract fun calculateSquare(): Double
}

class RectangleBox(
    val sideA: Int,
    val sideB: Int,
    val sideC: Int
) : Packed() {
    override fun calculateSquare(): Double {
        return (sideA * sideB * sideC).toDouble()
    }
}

class CubeBox(
    val sideA: Int,
) : Packed() {
    override fun calculateSquare(): Double {
        return sideA.toDouble().pow(2)
    }
}

fun main() {
    val rectanglePack = RectangleBox(2, 4,5)
    val cubePack = CubeBox(5)
    val arrayOfPacked = arrayOf(rectanglePack, cubePack)
    showSquare(arrayOfPacked)
}

fun showSquare(notes: Array<Packed>) {
    notes.forEach {
        println("Площадь пасылки ${it.calculateSquare()}")
    }
}