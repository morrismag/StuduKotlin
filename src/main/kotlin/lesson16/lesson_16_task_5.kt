package lesson16


class Gamer(
    val nameGamer: String,        // имя игрока
    private var health: Int,      // здоровье игрока
    var impactForce: Int,        // сила удара игрока
) {

    fun startGame() {
        println("Начало игры!")
        println(
            "Игрок: $nameGamer\n" +
                    "Здоровье: $health\n" +
                    "Сила удара:$impactForce"
        )
    }

    fun takeDamage(damage: Int) {
        println("Ты нанес удар Игроку $nameGamer равный $damage hp")
        health -= damage
        if (health <= 0) deathGamer()
        else println(
            "Игрок: $nameGamer\n" +
                    "Здоровье: $health\n" +
                    "Сила удара:$impactForce"
        )
    }

    fun treatment() {
        var takeHealth = 10
        println("Ты подлечил Игрока $nameGamer на $takeHealth hp")
        if (health <= 0) takeHealth = 0
        health += takeHealth
        println(
            "Игрок: $nameGamer\n" +
                    "Здоровье: $health\n" +
                    "Сила удара:$impactForce"
        )
    }

    private fun deathGamer() {
        impactForce = 0
        health = 0
        println(
            "Игрок: $nameGamer\n" +
                    "Здоровье: $health\n" +
                    "Сила удара:$impactForce\n" +
                    "И вообще он уже на приеме у апостала Павла)"
        )
    }
}

fun main() {
    val gamer = Gamer(
        "Валера",
        100,
        30,
    )

    gamer.startGame()
    println()
    Thread.sleep(4000)
    gamer.takeDamage(20)
    println()
    Thread.sleep(4000)
    gamer.treatment()
    println()
    Thread.sleep(4000)
    gamer.takeDamage(70)
    println()
    Thread.sleep(4000)
    gamer.takeDamage(200)

}