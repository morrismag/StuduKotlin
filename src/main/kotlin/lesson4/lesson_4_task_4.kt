package lesson4
// ... Если хочешь быть здоровым - закалЯйся, Голой жопой об забор ударЯйся ...

fun main() {
    val numberOfTrainingDay = 8

    println(
                "Упражнения для рук:    ${numberOfTrainingDay % 2 != 0}\n" +
                "Упражнения для ног:    ${numberOfTrainingDay % 2 == 0}\n" +
                "Упражнения для спины:  ${numberOfTrainingDay % 2 == 0}\n" +
                "Упражнения для пресса: ${numberOfTrainingDay % 2 != 0}"
    )
}