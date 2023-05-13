package lesson4

//  ... хоронили тещу - порвали два баяна ...
fun main() {
    val quantityAllTable = 13
    val quantityTodayTable = 13
    val quantityTomorrowTable = 9
    val resultToday: Boolean = quantityAllTable > quantityTodayTable
    val resultTomorrow: Boolean = quantityAllTable > quantityTomorrowTable

    println(
        "[Доступность столиков на сегодня: $resultToday]\n" +
                "[Доступность столиков на завтра: $resultTomorrow]"
    )
}