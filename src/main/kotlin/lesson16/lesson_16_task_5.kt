package lesson16

class  Gamer(    val nameGamer: String,        // имя игрока
         private var health: Int,              // здоровье игрока
                 var impactForce: Int,        // сила удара игрока
                 var damage: Int,             // урон, нанесенный игроку
                 var takeHealth:Int,          // хилинг
    )
{

        fun startGame(){
            println("Начало игры!")
            println("Игрок: $nameGamer\n" +
                    "Здоровье: $health\n" +
                    "Сила удара:$impactForce")
        }
    fun takeDamage(){
        println("Ты нанес удар Игроку $nameGamer равный $damage hp")
        health -= damage
        if (health<= 0) {
            deathGamer()
            takeHealth = 0
        }
        else println("Игрок: $nameGamer\n" +
                "Здоровье: $health\n" +
                "Сила удара:$impactForce")
    }

    fun treatment(){
        println("Ты подлечил Игрока $nameGamer на $takeHealth hp")
        health += takeHealth
        println("Игрок: $nameGamer\n" +
                "Здоровье: $health\n" +
                "Сила удара:$impactForce")
    }

    private fun deathGamer(){
        impactForce = 0
        health = 0
        println("Игрок: $nameGamer\n" +
                "Здоровье: $health\n" +
                "Сила удара:$impactForce\n" +
                "И вообще он уже на приеме у апостала Павла)")
        }
}
fun main() {
    val gamer = Gamer(
        "Валера",
        100,
        30,
        50,
        10,
    )

    gamer.startGame()
    println()
    Thread.sleep(4000)
    gamer.takeDamage()
    println()
    Thread.sleep(4000)
    gamer.treatment()
    println()
    Thread.sleep(4000)
    gamer.takeDamage()
    println()
    Thread.sleep(4000)
    gamer.takeDamage()
    println()
    Thread.sleep(4000)
    gamer.treatment()

}