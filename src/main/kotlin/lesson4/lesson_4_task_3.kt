package lesson4

// ... вот же, кроме Губка Боб ни чего и не скажешь ...
fun main() {
    val isSunOnTheSky = true
    val isOpenTent = true
    val itIsBestHumidity = 20
    val itIsBestSeasons: List<String> = listOf("3","4","5","6","7","8","9","10","11","весна", "лето", "осень")
    val nowIsSunOnTheSky = true
    val nowCIsSunOnTheSky = true
    val nowConditionHumidity = 20
    val nowConditionSeason = "зима" // в зависимости от переданных данных эту переменную можно преобразовывать
                                    // выделить например месяц
                                    //val nowConditionSeason1 = LocalDate.now().monthValue

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${(isSunOnTheSky == nowIsSunOnTheSky) 
                && (isOpenTent == nowCIsSunOnTheSky) 
                && (itIsBestHumidity == nowConditionHumidity) 
                && (nowConditionSeason in itIsBestSeasons)}"
    )
}