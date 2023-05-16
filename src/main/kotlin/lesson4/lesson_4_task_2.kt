package lesson4

// ... Почта России - это мы придумали изюм ...
fun main() {

    val cargoFirstWeight = 20
    val cargoFirstVolume = 80
    val cargoSecondWeight = 50
    val cargoSecondVolume = 100

    println(
        "Average для груза с весом $cargoFirstWeight кг и объемом $cargoFirstVolume л:" +
                " ${(cargoFirstWeight >= MIN_WEIGHT) && (cargoFirstWeight <= MAX_WEIGHT) && (cargoFirstVolume < MAX_VOLUME_LITERS)}\n" +
                "Average для груза с весом $cargoSecondWeight кг и объемом $cargoSecondVolume л:" +
                " ${(cargoSecondWeight >= MIN_WEIGHT) && (cargoSecondWeight <= MAX_WEIGHT) && (cargoSecondVolume < MAX_VOLUME_LITERS)}"
    )
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME_LITERS = 100