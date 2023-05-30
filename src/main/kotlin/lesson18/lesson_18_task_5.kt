package lesson18

abstract class Screen {
    abstract fun drawPoint()
    abstract fun drawCircle()
    abstract fun drawRectangle()
}

class Point(
    val nameFigure: String = "Точка",
) : Screen() {
    override fun drawPoint() {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Функция рисует фигуру \"$nameFigure\" с координатами ($coordinateX,$coordinateY)")
    }

    override fun drawCircle() {

    }

    override fun drawRectangle() {

    }
}

class Circle(
    val nameFigure: String = "Круг",
) : Screen() {
    override fun drawPoint() {
    }

    override fun drawCircle() {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Введи радиус окружности:")
        val radiusCircle = readln().toFloatOrNull() ?: 0
        println(
            "Функция рисует фигуру \"$nameFigure\" " +
                    "с центром ($coordinateX,$coordinateY) и радиусом $radiusCircle"
        )
    }

    override fun drawRectangle() {

    }
}

class Rectangle(
    val nameFigure: String = "Прямоугольник",
) : Screen() {
    override fun drawPoint() {
    }

    override fun drawCircle() {
    }

    override fun drawRectangle() {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Введи диагональ прямоугольника:")
        val diagRectangle = readln().toFloatOrNull() ?: 0
        println(
            "Функция рисует фигуру \"$nameFigure\" " +
                    "с базовой точкой ($coordinateX,$coordinateY) и диагональю $diagRectangle"
        )
    }
}

fun main() {
    val pointTest = Point()
    val circleTest = Circle()
    val rectangleTest = Rectangle()

    println("Выбери и напиши, какую фигуру нарисовать:\nТочка, Круг, Прямоугольник")
    when (readln()) {
        "Точка" -> pointTest.drawPoint()
        "Круг" -> circleTest.drawCircle()
        "Прямоугольник" -> rectangleTest.drawRectangle()
        else -> println("Ты не выбрал ни одну фигуру")
    }
}