package lesson4
// ... Почта России - это мы придумали изюм ...
fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolumeInLiters = 100
    val cargoFirstWeight = 20
    val cargoFirstVolume = 80
    val cargoSecondWeight = 50
    val cargoSecondVolume = 100

    println(
        "Average для груза с весом $cargoFirstWeight кг и объемом $cargoFirstVolume л:" +
        " ${(cargoFirstWeight >= minWeight) && (cargoFirstWeight <= maxWeight) && (cargoFirstVolume < maxVolumeInLiters)}\n" +
        "Average для груза с весом $cargoSecondWeight кг и объемом $cargoSecondVolume л:" +
        " ${(cargoSecondWeight >= minWeight) && (cargoSecondWeight <= maxWeight) && (cargoSecondVolume < maxVolumeInLiters)}"
    )
}