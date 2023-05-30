package lesson18

open class Animal {
     var nameAnimal: String = ""
    open fun playAnimal() = ""
    open fun eatAnimal() = ""
    open fun sleepAnimal() = ""

}

class Fox : Animal() {

    override fun eatAnimal(): String {
        return "Животное $nameAnimal ест ягоды"
    }
}
class Cat:Animal(){
    override fun eatAnimal(): String {
        return "Животное $nameAnimal ест рыбу"
    }
}

class Dog:Animal(){
    override fun eatAnimal(): String {
        return "Животное $nameAnimal грызет кости"
    }
}

fun main() {
    val fox=Fox()
    fox.nameAnimal ="Лиса Алиса"
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