package lesson19

class Tank {
    fun reloadWeapons(): String {
        println(
            "Стрелок поменять тип патронов. Выбери:\n" +
                    "синие, зеленые, красные."
        )
        return readln()
    }

    fun shotTank(typePatron: String): String {
        return when (typePatron) {
            "синие" -> "Нанесенный урон: ${TypePatron.BLUE.damage}"
            "зеленые" -> "Нанесенный урон: ${TypePatron.GREEN.damage}"
            "красные" -> "Нанесенный урон: ${TypePatron.RED.damage}"
            else -> "Мехвод вывози нас отсюда, этот косорукий не может нормально перезарядить пушку!!!"
        }
    }
}

fun main() {
    val tankT90 = Tank()
    var typePatron = tankT90.reloadWeapons()
    println()
    println(tankT90.shotTank(typePatron))
    println()
    typePatron = tankT90.reloadWeapons()
    println()
    println(tankT90.shotTank(typePatron))
}

enum class TypePatron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}