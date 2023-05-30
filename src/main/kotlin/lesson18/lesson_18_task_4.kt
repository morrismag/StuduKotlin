package lesson18

import kotlin.math.pow

abstract class Packed {
    abstract fun calculateSquare(): Int

}

class RectangleBox(
    val sideA: Int,
    val sideB: Int,
) : Packed() {
    override fun calculateSquare(): Int {
        return sideA * sideB
    }
}

class CubeBox(
    val sideA: Int,
) : Packed() {
    override fun calculateSquare(): Int {
        return sideA.toDouble().pow(2).toInt()
    }
}

fun main() {
    val rectanglePack = RectangleBox(2, 4)
    val cubePack = CubeBox(5)
    val arrayOfPacked = arrayOf(rectanglePack, cubePack)
    showSquare(arrayOfPacked)
}

fun showSquare(notes: Array<Packed>) {
    notes.forEach {
        println("Площадь пасылки ${it.calculateSquare()}")
    }
}