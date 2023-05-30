package lesson15

interface Moveable {
    fun moveCar()
}

interface CargoTransport {
    fun cargo(): Int
}

interface PassengerTransport {
    fun passenger(): Int
}


class Truck(val name: String) : Moveable, CargoTransport, PassengerTransport {
    override fun cargo(): Int {
        val cargo = 2
        return cargo
    }

    override fun moveCar() {
        println("Поехал грузовик $name")
    }

    override fun passenger(): Int {
        val people = 1
        return people
    }
}

class PassengerCar(val name: String) : Moveable, PassengerTransport {

    override fun passenger(): Int {
        val people = 3
        return people
    }

    override fun moveCar() {
        println("Поехала легковая машина $name")
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

    println("${truck1.moveCar()}")
    println(
        "Для перевозки ${truck1.cargo()} тонн, необходимо один рейс ${truck1.name}\n" +
                "А если перевезти 6 чеовек то нужно ${truck1.passenger() * 6} рейсов ${truck1.name}"
    )
    println()
    println("${passCar.moveCar()}")
    println("Для перевозки ${passCar.passenger() * 2} человек, необходимо 2 машины ${passCar.name}.")
}