package lesson18

abstract class AbstractFigure(nameFigure: String)

class Point(
    val nameFigure: String = "Точка",
) : AbstractFigure(nameFigure)

class Circle(
    val nameFigure: String = "Круг",
) : AbstractFigure(nameFigure)

class Rectangle(
    val nameFigure: String = "Прямоугольник",
) : AbstractFigure(nameFigure)

class Screen {
    fun drawFigurePoint(figureName: Point) {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Функция рисует фигуру \"$figureName\" с координатами ($coordinateX,$coordinateY)")
    }

    fun drawFigureCircle(figureName: Circle) {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Введи радиус окружности:")
        val radiusCircle = readln().toFloatOrNull() ?: 0
        println(
            "Функция рисует фигуру \"$figureName\" " +
                    "с центром ($coordinateX,$coordinateY) и радиусом $radiusCircle"
        )
    }

    fun drawFigureRectangle(figureName: Rectangle) {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Введи диагональ прямоугольника:")
        val diagRectangle = readln().toFloatOrNull() ?: 0
        println(
            "Функция рисует фигуру \"$figureName\" " +
                    "с базовой точкой ($coordinateX,$coordinateY) и диагональю $diagRectangle"
        )
    }
}

fun main() {
    val pointTest = Point()
    val circleTest = Circle()
    val rectangleTest = Rectangle()
    val screenTest = Screen()

    println("Выбери и напиши, какую фигуру нарисовать:\nТочка, Круг, Прямоугольник")

    when (readln()) {
        "Точка" -> screenTest.drawFigurePoint(pointTest)
        "Круг" -> screenTest.drawFigureCircle(circleTest)
        "Прямоугольник" -> screenTest.drawFigureRectangle(rectangleTest)
        else -> println("Ты не выбрал ни одну фигуру")
    }
}