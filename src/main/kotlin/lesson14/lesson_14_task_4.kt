package lesson14

open class CelestialBodies(
    val habitabilityIs: Boolean,
    val atmosphereIs: Boolean,
    val waterIs: Boolean,
    val disembarkation: Boolean
)

class Planet(
    habitabilityIs: Boolean,
    atmosphereIs: Boolean,
    waterIs: Boolean,
    disembarkation: Boolean,
    val nameBody: String,
    val typeCelestialBody: String,
    val quantitySatellites: Int,
) : CelestialBodies(habitabilityIs, atmosphereIs, waterIs, disembarkation)

class Satellite(
    habitabilityIs: Boolean,
    atmosphereIs: Boolean,
    waterIs: Boolean,
    disembarkation: Boolean,
    val nameBody: String,
    val typeCelestialBody: String,
    val nameMainPlanet: String,
) : CelestialBodies(habitabilityIs, atmosphereIs, waterIs, disembarkation)

fun main() {
    val earth = Planet(
        true,
        true,
        true,
        true,
        "Земля",
        "планета",
        2,
    )
    val moon = Satellite(
        false,
        false,
        false,
        true,
        "Луна",
        "спутник",
        "Земля"
    )
    val nibiru = Satellite(
        false,
        true,
        false,
        true,
        "Нибиру",
        "спутник",
        "Земля"
    )

    println(
        "У планеты ${earth.nameBody} ${earth.quantitySatellites} спутника:\n" +
                "${moon.nameBody} и ${nibiru.nameBody}"
    )
}