package lesson15

// ...  Иван не понял задание . Тут вначале нужно решить какая последовательность доставки туда сюда машин,
// т.е. решить загадку на логику,
// а потом написание процедур или просто написать что отправка одной грузовой и 2-х легковых машин?...
interface CargoTransport {
    fun cargo(): Int
}

interface PassengerTransport {
    fun passenger(): Int
}

abstract class Cars : CargoTransport, PassengerTransport {
    abstract val name: String
}

class Truck(override val name: String) : Cars() {
    override fun cargo(): Int {
        val cargo = 2
        return cargo
    }

    override fun passenger(): Int {
        val people = 1
        return people
    }
}

class PassengerCar(override val name: String) : Cars() {
    override fun cargo(): Int {
        val cargo = 0
        return cargo
    }

    override fun passenger(): Int {
        val people = 3
        return people
    }
}

fun main() {
    println(
        "По заданию необходимо из точки А в точку Б перевезти 6 пассажиров и 2 тонны грузов\n" +
                "Один грузовик может перевести 2 тонны груза и 1-го пассажира\n" +
                "Легковая машина может перевести 3-х пассажиров\n"
    )
    val truck1 = Truck("Грузовик")
    val passCar = PassengerCar("Волга")

    println(
        "Для перевозки ${truck1.cargo()} тонн, необходимо один рейс ${truck1.name}" +
                " и выкинуть попутчика на пол пути."
    )
    println("Для перевозки ${passCar.passenger()} человек, необходимо две машины ${passCar.name}." +
            "И не подбирать попутчика из грузовой машины)))")
}