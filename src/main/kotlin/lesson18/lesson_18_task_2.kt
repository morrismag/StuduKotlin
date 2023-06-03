package lesson18

abstract class PropertyBone {
    abstract val quantitySideOfBone: Int

    abstract fun rollOfTheDice(): Int

}

class BoneWithFourFaces : PropertyBone() {
    override val quantitySideOfBone = 4
    override fun rollOfTheDice(): Int {
        return (1..quantitySideOfBone).random()
    }
}

class BoneWithSixFaces : PropertyBone() {
    override val quantitySideOfBone = 6
    override fun rollOfTheDice(): Int {
        return (1..quantitySideOfBone).random()
    }
}

class BoneWithEightFaces : PropertyBone() {
    override val quantitySideOfBone = 8
    override fun rollOfTheDice(): Int {
        return (1..quantitySideOfBone).random()
    }
}

fun main() {
    val bone4side: PropertyBone = BoneWithFourFaces()
    val bone6side: PropertyBone = BoneWithSixFaces()
    val bone8side: PropertyBone = BoneWithEightFaces()

    println(
        "Бросили кость с ${bone4side.quantitySideOfBone} гранями.\n" +
                "Выпало число ${bone4side.rollOfTheDice()}"
    )
    println()
    println(
        "Бросили кость с ${bone6side.quantitySideOfBone} гранями.\n" +
                "Выпало число ${bone6side.rollOfTheDice()}"
    )
    println()
    println(
        "Бросили кость с ${bone8side.quantitySideOfBone} гранями.\n" +
                "Выпало число ${bone8side.rollOfTheDice()}"
    )
}