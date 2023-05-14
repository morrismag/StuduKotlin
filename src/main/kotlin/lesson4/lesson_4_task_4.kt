package lesson4
// ... Если хочешь быть здоровым - закалЯйся, Голой жопой об забор ударЯйся ...

fun main() {
    val numberOfTrainingDay = 8
    val parityOfDay: Boolean = (numberOfTrainingDay % 2 ==0)
    val handsPart: Boolean = !parityOfDay
    val legsPart: Boolean = parityOfDay
    val backPart: Boolean = parityOfDay
    val abdominalPressPart: Boolean = !parityOfDay

    println(
                "Упражнения для рук:    $handsPart\n" +
                "Упражнения для ног:    $legsPart\n" +
                "Упражнения для спины:  $backPart\n" +
                "Упражнения для пресса: $abdominalPressPart"
    )
}