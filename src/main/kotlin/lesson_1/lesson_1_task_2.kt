package lesson_1

fun main() {
    val numberOFOrders: Int = 75
    val titleGratitude: String = "Вы лучшие покупатели"

    println("Общее кол-во заказов = $numberOFOrders")
    println("Благодарность: \"$titleGratitude\"")
    println()

    var storeStaff: Int = 2000

    // println("Персонал магазина составляет $storeStaff человек")

    storeStaff = 2000 - 1
    println(
        "${storeStaff + 1} негритят отправились обедать,\n" +
                "Один поперхнулся, их осталось $storeStaff."
    )

}