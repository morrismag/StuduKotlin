package lesson_1

fun main() {
    val numberOFOrders: Int = 75
    val titleGratitude: String = "Вы лучшие покупатели"

    println("Общее кол-во заказов = $numberOFOrders")
    println("Благодарность: \"$titleGratitude\"")
    println()

    val storeStaff: Int = 2000

    //println("Персонал магазина составляет $storeStaff человек")

    val storeStaffAfterParty: Int = storeStaff - 1
    println(
        "$storeStaff негритят отправились обедать,\n" +
                "Один поперхнулся, их осталось $storeStaffAfterParty."
    )

}