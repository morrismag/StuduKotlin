package lesson8

import java.util.*

// ... это было интересно ...
fun main() {
    val musicInstruments: Array<String> = arrayOf("Фортепьяно", "Скрипка", "Кларнет", "Труба", "Контрабас")

    println("Инструменты, участвующие в оркестре:")
    for (i in musicInstruments.indices) {
        println(musicInstruments[i])
    }
    println("Выбирите, какой инструмент Вы замените:")
    var userChoice = readln()

    while (userChoice.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        !in musicInstruments) {
        println("Такого инструмента нет в оркестре. Введите инструмент из списка снова:")
        userChoice = readln()
    }
    userChoice =
        userChoice.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    val indexInstrument = musicInstruments.indexOf(userChoice)

    println("На какой инструмент вы хотите заменить выбранный " +
            "\"${
                userChoice.replaceFirstChar
                { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            }\""
    )
    userChoice = readln()
    musicInstruments[indexInstrument] =
        userChoice.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println("Готово! Вы сохранили состав оркестра: [${musicInstruments.joinToString(", ")}]")
}