package lesson4

// ... вот же, кроме Губка Боб ни чего и не скажешь ...
fun main() {
    val necessaryConditionWeather = "солнечная погода"
    val necessaryConditionTent = "тент раскрыт"
    val necessaryConditionHumidity = "влажность 20"
    val necessaryConditionSeason = "время года не зима"
    val nowConditionWeather = "солнечная погода"
    val nowConditionTent = "тент раскрыт"
    val nowConditionHumidity = "влажность 20"
    val nowConditionSeason = "время года зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(necessaryConditionWeather == nowConditionWeather) && (necessaryConditionTent == nowConditionTent) && (necessaryConditionHumidity == nowConditionHumidity) && (necessaryConditionSeason == nowConditionSeason)}"
    )
}