package lesson2
    // ... Граждане! Храните деньги в сберегательной кассе, если конечно они у вас есть! ...
import kotlin.math.pow

fun main() {
    val contribution = 70000
    val percentInYear = 0.167
    val periodTwentyYears = 20
    val result = (1 + percentInYear).pow(periodTwentyYears) * contribution

    println("Размер вклада через 20-ть лет: ${String.format("%.3f", result)}")
}