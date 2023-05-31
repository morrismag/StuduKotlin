package lesson19

fun main() {
    val fishInAquarium = listOf(1, 2, 3, 4)
    for (i in fishInAquarium)
        when (i) {
            Fish.GUPPI.id -> setFish(Fish.GUPPI)
            Fish.ANGELFISH.id -> setFish(Fish.ANGELFISH)
            Fish.GOLDFISH.id -> setFish(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.id -> setFish(Fish.SIAMESE_FIGHTING_FISH)
        }
}

enum class Fish(val id: Int) {
    GUPPI(1),
    ANGELFISH(2),
    GOLDFISH(3),
    SIAMESE_FIGHTING_FISH(4);

}

fun setFish(nameFish: Fish) {
    when (nameFish) {
        Fish.GUPPI -> println("Рыбка Гуппи")
        Fish.ANGELFISH -> println("Рыбка Скалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Рыбка Петушок")
    }
}