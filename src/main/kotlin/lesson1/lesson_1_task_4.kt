package lesson1

//... подумать на досуге ...
fun main(){
    val length: Long = 40868600000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val second: Short = 6480
    val partOfYear: Double = 0.00020547945205479453
    val apogee: Int = 327000

    println("Любопытная информация о полете Юрия Гагарина: \n" +
            "Расстояние, которое гагарин пролетел вокруг земли составило: $length миллиметров\n" +
            "Юрию Гагарину было $age лет \n" +
            "В космосе Гагарин пробыл $partOfDay часть дня, \n" +
            "а это равно $second секунд \n" +
            "и составляет $partOfYear часть года \n" +
            "Апогей орбиты полета Юрия Гагарина составил $apogee метров")
}
