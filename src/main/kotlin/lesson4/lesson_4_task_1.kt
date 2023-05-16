package lesson4

//  ... хоронили тещу - порвали два баяна ...
fun main() {
    val quantityTodayTable = 13
    val quantityTomorrowTable = 9
    val resultToday: Boolean = QUANTITY_ALL_TABLES > quantityTodayTable
    val resultTomorrow: Boolean = QUANTITY_ALL_TABLES > quantityTomorrowTable

    println(
        "[Доступность столиков на сегодня: $resultToday]\n" +
                "[Доступность столиков на завтра: $resultTomorrow]"
    )
}
const val QUANTITY_ALL_TABLES = 13