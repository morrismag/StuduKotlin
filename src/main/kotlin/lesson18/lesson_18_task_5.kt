package lesson18

abstract class AbstractFigure(nameFigure: String) {
    abstract fun drawFigure()

}

class Point(
    val nameFigure: String = "Точка",
) : AbstractFigure(nameFigure) {
    override fun drawFigure() {
        println("Введи координату X:")
        val coordinateX = readln().toFloatOrNull() ?: 0
        println("Введи координату Y:")
        val coordinateY = readln().toFloatOrNull() ?: 0
        println("Функция рисует фигуру \"$nameFigure\" с координатами ($coordinateX,$coordinateY)")
    }
}

class Circle(
    val nameFigure: String = "Круг",
) : AbstractFigure(nameFigure) {

    override fun drawFigure() {
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
}

class Rectangle(
    val nameFigure: String = "Прямоугольник",
) : AbstractFigure(nameFigure) {
    override fun drawFigure() {
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

class Screen {
    fun drawFigure(figure: AbstractFigure) {
        when (figure) {
            is Point -> figure.drawFigure()
            is Circle -> figure.drawFigure()
            is Rectangle -> figure.drawFigure()
            else -> println("Ты не выбрал ни одну фигуру")
        }
    }
}


fun main() {
    val pointTest = Point()
    val circleTest = Circle()
    val rectangleTest = Rectangle()
    val screenTest = Screen()

    println("Выбери и напиши, какую фигуру нарисовать:\nТочка, Круг, Прямоугольник")

    when (readln()) {
        "Точка" -> screenTest.drawFigure(pointTest)
        "Круг" -> screenTest.drawFigure(circleTest)
        "Прямоугольник" -> screenTest.drawFigure(rectangleTest)
        else -> println("Ты не выбрал ни одну фигуру")
    }
}