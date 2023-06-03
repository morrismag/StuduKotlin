package lesson18

abstract class Animal() {
    var nameAnimal: String = ""
    abstract fun playAnimal()
    abstract fun eatAnimal(): String
    abstract fun sleepAnimal()
}

class Fox : Animal() {
    override fun playAnimal() {}

    override fun eatAnimal(): String {
        return "Животное $nameAnimal ест ягоды"
    }

    override fun sleepAnimal() {}
}

class Cat : Animal() {
    override fun playAnimal() {
    }

    override fun eatAnimal(): String {
        return "Животное $nameAnimal ест рыбу"
    }

    override fun sleepAnimal() {
    }
}

class Dog : Animal() {
    override fun playAnimal() {
    }

    override fun eatAnimal(): String {
        return "Животное $nameAnimal грызет кости"
    }

    override fun sleepAnimal() {
    }
}

fun main() {
    val fox = Fox()
    fox.nameAnimal = "Лиса Алиса"
    val cat = Cat()
    cat.nameAnimal = "Кошка"
    val dog = Dog()
    dog.nameAnimal = "Собака"

    println(fox.eatAnimal())
    println()
    println(cat.eatAnimal())
    println()
    println(dog.eatAnimal())
}