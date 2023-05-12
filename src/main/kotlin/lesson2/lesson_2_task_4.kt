package lesson2

fun main() {
    val baffForMaterials = 0.2f
    val cristalRude = 7
    val ironRude =11
    val baffCristalRude: Int = (baffForMaterials*cristalRude).toInt()
    val baffIronRude: Int = (baffForMaterials*ironRude).toInt()

    println("Бонусные кристаллы:$baffCristalRude")
    println("Бонусные металлы:$baffIronRude")
}