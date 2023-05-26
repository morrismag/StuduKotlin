package lesson14

// ... Заметил интересную вещь - произвольно вводить стороны треугольника не совсем
// правильно. Формула площади по периоду перестает работать- она работает только до 90 градусов ...

import kotlin.math.sqrt

abstract class Figure {
    abstract val colorFigure: String
    abstract fun perimeterFigure(): Double
    abstract fun squareFigure(): Double
}

class Circle(
    override val colorFigure: String,
    val typeFigure: String,
    val data: List<Int>,
) : Figure() {
    override fun perimeterFigure(): Double {
        return 2 * 3.14 * data[0]
    }

    override fun squareFigure(): Double {
        return 3.14 * data[0] * data[0]
    }
}

class Rectangle(
    override val colorFigure: String,
    val typeFigure: String,
    val data: List<Int>,
) : Figure() {
    override fun perimeterFigure(): Double {
        return (2 * (data[0] + data[1])).toDouble()
    }

    override fun squareFigure(): Double {
        return (data[0] * data[1]).toDouble()
    }
}

class Triangle(
    override val colorFigure: String,
    val typeFigure: String,
    val data: List<Int>,
) : Figure() {
    override fun perimeterFigure(): Double {
        return (data[0] + data[1] + data[2]).toDouble()
    }

    override fun squareFigure(): Double {
        val poluPerimeter = (data[0] + data[1] + data[2]) / 2
        return sqrt(
            (poluPerimeter *
                    (poluPerimeter - data[0]) *
                    (poluPerimeter - data[1]) *
                    (poluPerimeter - data[2])).toDouble()
        )

    }
}

fun main() {
    val circle1 = Circle(
        "красный",
        "круг",
        data = listOf(5)
    )
    val circle2 = Circle(
        "зеленый",
        "круг",
        data = listOf(8)
    )
    val rectangle1 = Rectangle(
        "красный",
        "прямоугольник",
        data = listOf(3, 6)
    )
    val rectangle2 = Rectangle(
        "черный",
        "прямоугольник",
        data = listOf(3, 6)
    )
    val triangle1 = Triangle(
        "красный",
        "треугольник",
        data = listOf(3, 4, 5)
    )
    val triangle2 = Triangle(
        "зеленый",
        "треугольник",
        data = listOf(3, 7, 5)
    )

    val resultList = listOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
    sumPerimeterFigure(resultList)
    sumSquareFigure(resultList)
}

fun sumPerimeterFigure(list: List<Figure>) {
    var sum = 0.0
    for (i in list.indices) {
        if (list[i].colorFigure == "красный") {
            sum += list[i].perimeterFigure()
            println(sum)
        }
    }
    println("Сумма периметров красных фигур равна $sum")
}

fun sumSquareFigure(list: List<Figure>) {
    var sum = 0.0
    for (i in list.indices) {
        if (list[i].colorFigure == "красный") {
            sum += list[i].squareFigure()
            println(sum)
        }
    }
    println("Сумма площадей красных фигур равна $sum")
}
