package lesson5

import java.time.LocalDate

fun main() {

    println("Введите, пожалуйста, год своего рождения (формат пример: 2020):")
    val userDateOfBirth: Int = readln().toInt()
    val yearNow = LocalDate.now().year
        if ((yearNow - userDateOfBirth) in AGE_ACCESS..AGE_DEATH) println("Показать экран со скрытым контентом.")
        else if ((yearNow - userDateOfBirth) > AGE_DEATH) println("Ай яй яй. Седина в бороду - бес в ребро. Пора думать о вечном)))")
        else println("Подрасти еще, салага")
}

const val AGE_ACCESS = 18
const val AGE_DEATH = 70
