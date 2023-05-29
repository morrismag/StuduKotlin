package lesson15

abstract class WeatherControlStation {
    abstract val baseMassage: String

    abstract fun connectToServer()
    abstract fun sendMassage()
}

class MassageTemperature() : WeatherControlStation() {

    override val baseMassage: String = "16 градусов Цельсия"
    override fun connectToServer() {
        println("Подсоединился к серверу")
    }

    override fun sendMassage() {
        println("Сегодня температура воздуха: $baseMassage")
    }
}

class MassagePrecipitationAmount : WeatherControlStation() {
    override val baseMassage: String = "13 мм"

    override fun connectToServer() {
        println("Подсоединился к серверу")
    }

    override fun sendMassage() {
        println("Сегодня количество осадков: $baseMassage")
    }
}

fun main() {
    val temperatureMassage = MassageTemperature()
    val precipitationAmountMassage = MassagePrecipitationAmount()

    println(temperatureMassage.connectToServer())
    println(temperatureMassage.sendMassage())
    println()
    println(precipitationAmountMassage.connectToServer())
    println(precipitationAmountMassage.sendMassage())
}