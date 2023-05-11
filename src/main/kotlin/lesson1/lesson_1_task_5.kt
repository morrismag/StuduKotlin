package lesson1

fun main(){
    val secondsOfFirstFlight: Short = 6480
    var minutesOfFirstFlight: Int = 0
    var remainsSecond: Int =0

    minutesOfFirstFlight = secondsOfFirstFlight/60
    remainsSecond = secondsOfFirstFlight - minutesOfFirstFlight*60

    if (remainsSecond in 0..9){
        println("Гагарин провел в космосе: $minutesOfFirstFlight:0$remainsSecond  в минутах")
    } else {
        println("Гагарин провел в космосе: $minutesOfFirstFlight:$remainsSecond в минутах")
    }
}
