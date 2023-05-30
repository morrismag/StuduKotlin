package lesson15

abstract class WeatherControlStation {
    abstract val baseMessage: String

    abstract fun connectToServer()
    abstract fun sendMessage()
}

class MassageTemperature() : WeatherControlStation() {

    override val baseMessage: String = "16 градусов Цельсия"
    override fun connectToServer() {
        println("Подсоединился к серверу")
    }

    override fun sendMessage() {
        println("Сегодня температура воздуха: $baseMessage")
    }
}

class MassagePrecipitationAmount : WeatherControlStation() {
    override val baseMessage: String = "13 мм"

    override fun connectToServer() {
        println("Подсоединился к серверу")
    }

    override fun sendMessage() {
        println("Сегодня количество осадков: $baseMessage")
    }
}

fun main() {
    val temperatureMassage = MassageTemperature()
    val precipitationAmountMassage = MassagePrecipitationAmount()

    temperatureMassage.connectToServer()
    temperatureMassage.sendMessage()
    println()
    precipitationAmountMassage.connectToServer()
    precipitationAmountMassage.sendMessage()
}