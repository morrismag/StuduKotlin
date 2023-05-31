package lesson19

class Tank {
    fun reloadingWeapons(): String {
        println(
            "Стрелок поменять тип патронов. Выбери:\n" +
                    "синие, зеленые, красные."
        )
        return readln()
    }

    fun shotTank(typePatron: String): String {
        return when (typePatron) {
            "синие" -> "Нанесенный урон: ${TypePatron.BLUE.shotPower()}"
            "зеленые" -> "Нанесенный урон: ${TypePatron.GREEN.shotPower()}"
            "красные" -> "Нанесенный урон: ${TypePatron.RED.shotPower()}"
            else -> "Мехвод вывози нас отсюда, этот косорукий не может нормально перезарядить пушку!!!"
        }
    }
}

fun main() {
    val tankT90 = Tank()
    var typePatron = tankT90.reloadingWeapons()
    println()
    println(tankT90.shotTank(typePatron))
    println()
    typePatron = tankT90.reloadingWeapons()
    println()
    println(tankT90.shotTank(typePatron))
}

enum class TypePatron {
    BLUE {
        override fun shotPower(): Int {
            return 5
        }
    },
    GREEN {
        override fun shotPower(): Int {
            return 10
        }
    },
    RED {
        override fun shotPower(): Int {
            return 20
        }
    };

    abstract fun shotPower(): Int
}