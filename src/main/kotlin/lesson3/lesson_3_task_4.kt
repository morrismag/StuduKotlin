package lesson3

// ... Позвольте, товарищ, у меня все ходы записаны. — Контора пишет! ...
fun main() {
    var gaitNumber = 1
    var fromWhereGait = "E2"
    var whereToGait = "E4"

    println("[$fromWhereGait-$whereToGait;$gaitNumber]")

    gaitNumber = 2
    fromWhereGait = "D2"
    whereToGait = "D3"

    println("[$fromWhereGait-$whereToGait;$gaitNumber]")
}