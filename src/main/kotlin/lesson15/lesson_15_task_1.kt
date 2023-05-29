package lesson15

interface FlyingCreatures {
    fun flying()
}

interface FloatingCreatures {
    fun floating()
}

class Karas(
    val name: String
) : FloatingCreatures {
    override fun floating() {
        println("Это существо $name плавает под водой")
    }

}

class Utka(
    val name: String
) : FloatingCreatures {
    override fun floating() {
        println("Это существо $name плавает по поверхности воды")
    }

}

class Chayka(
    val name: String
) : FlyingCreatures {
    override fun flying() {
        println("Это существо $name летает над водой")
    }
}

fun main() {
    val karas = Karas("карась")
    val utka = Utka("утка")
    val chayka = Chayka("чайка")

    println("${karas.floating()}")
    println("${utka.floating()}")
    println("${chayka.flying()}")
}