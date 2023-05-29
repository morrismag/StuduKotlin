package lesson17

class Victorina {
    var question: String = ""
        set(value) {
            field = value
        }
    var answer: String = ""
        get() = field
        set(value) {
            field = value
        }
}

fun main() {

}