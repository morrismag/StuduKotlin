package lesson14

import kotlin.math.sqrt

abstract class Figure {
    abstract val colorFigure: String
    abstract fun perimeterFigure(): Double
    abstract fun squareFigure(): Double
}

class Circle(
    override val colorFigure: String,
    val radius: Int,
) : Figure() {
    override fun perimeterFigure(): Double {
        return 2 * kotlin.math.PI * radius
    }

    override fun squareFigure(): Double {
        return kotlin.math.PI * radius * radius
    }
}

class Rectangle(
    override val colorFigure: String,
    val sideRectangleA: Int,
    val sideRectangleB: Int,
) : Figure() {
    override fun perimeterFigure(): Double {
        return (2 * (sideRectangleA + sideRectangleB)).toDouble()
    }

    override fun squareFigure(): Double {
        return (sideRectangleA * sideRectangleB).toDouble()
    }
}

class Triangle(
    override val colorFigure: String,
    val sideTriangleA: Int,
    val sideTriangleB: Int,
    val sideTriangleC: Int,
) : Figure() {
    override fun perimeterFigure(): Double {
        return (sideTriangleA + sideTriangleB + sideTriangleC).toDouble()
    }

    override fun squareFigure(): Double {
        val poluPerimeter = (sideTriangleA + sideTriangleB + sideTriangleC) / 2
        return sqrt(
            (poluPerimeter *
                    (poluPerimeter - sideTriangleA) *
                    (poluPerimeter - sideTriangleB) *
                    (poluPerimeter - sideTriangleC)).toDouble()
        )

    }
}

fun main() {
    val circle1 = Circle(
        colorFigure = COLOR_RED,
        radius = 5
    )
    val circle2 = Circle(
        colorFigure = COLOR_GREEN,
        radius = 8
    )
    val rectangle1 = Rectangle(
        colorFigure = COLOR_RED,
        sideRectangleA = 3,
        sideRectangleB = 8,
    )
    val rectangle2 = Rectangle(
        colorFigure = COLOR_BLACK,
        sideRectangleA = 2,
        sideRectangleB = 4,
    )
    val triangle1 = Triangle(
        colorFigure = COLOR_RED,
        sideTriangleA = 3,
        sideTriangleB = 4,
        sideTriangleC = 5,
    )
    val triangle2 = Triangle(
        colorFigure = COLOR_GREEN,
        sideTriangleA = 3,
        sideTriangleB = 7,
        sideTriangleC = 5,
    )

    val resultList = listOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
    sumPerimeterFigure(resultList)
    sumSquareFigure(resultList)
}

fun sumPerimeterFigure(list: List<Figure>) {
    var sum = 0.0
    for (i in list.indices) {
        if (list[i].colorFigure == COLOR_RED) {
            sum += list[i].perimeterFigure()
        }
    }
    println("Сумма периметров красных фигур равна $sum")
}

fun sumSquareFigure(list: List<Figure>) {
    var sum = 0.0
    for (i in list.indices) {
        if (list[i].colorFigure == COLOR_RED) {
            sum += list[i].squareFigure()
        }
    }
    println("Сумма площадей красных фигур равна $sum")
}

const val COLOR_RED = "красный"
const val COLOR_GREEN = "зеленый"
const val COLOR_BLACK = "черный"