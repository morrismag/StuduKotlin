package lesson15

interface Moveable {
    fun moveCar()
}

interface CargoTransport {
    fun transportCargo()
}

interface PassengerTransport {
    fun transportPassenger()
}

class Truck(val name: String, val cargo: Int, val people: Int) : Moveable, CargoTransport, PassengerTransport {
    override fun transportCargo() {
        println("Вес груза = $cargo")
    }

    override fun moveCar() {
        println("Поехал грузовик $name")
    }

    override fun transportPassenger() {
        println("Пассажиров = $people")
    }

}

class PassengerCar(val name: String, val people: Int) : Moveable, PassengerTransport {

    override fun transportPassenger() {
        println("Пассажиров = $people")
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
    val truck1 = Truck("Грузовик", 2, 1)
    val passCar = PassengerCar("Волга", 3)

    truck1.moveCar()
    truck1.transportCargo()
    println("Нужен 1 рейс")
    truck1.transportPassenger()
    println("Нужено 6 рейсов")
    println()
    passCar.moveCar()
    passCar.transportPassenger()
    println("Нужено 2 рейса")
}