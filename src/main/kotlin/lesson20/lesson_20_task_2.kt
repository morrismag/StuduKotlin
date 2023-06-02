package lesson20

class Gamer(
    val nameGamer: String,
    val currentHealth: Int,
    val maxHealth: Int,
)

fun main() {
    val gamer = Gamer("Vasy", 50, 100)
    println("У ${gamer.nameGamer} текущее значение здоровье ${gamer.currentHealth}.");
    { it: Int -> println("${gamer.nameGamer} взял лечение и его здоровье стало максимальным $it.") }(gamer.maxHealth)
}