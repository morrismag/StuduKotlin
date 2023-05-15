package lesson3

// ...Татьяна (русская душою,
//Сама не зная, почему)
//С ее холодною красою
//Любила русскую зиму ...

fun main() {
    val surname = "Андреева"
    val surnameHusband = "Сидорова"
    val name = "Татьяна"
    val nameByFather = "Сергеевна"
    val age: List<Int> = listOf(20, 22)

    println("[$surname $name $nameByFather, ${age[0]} лет]")
    println("[$surnameHusband $name $nameByFather, ${age[1]} года]")
}