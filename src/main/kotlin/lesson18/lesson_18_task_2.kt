package lesson18

open class PropertyBone {
    open val quantitySideOfBone: Int = 0

    fun rollOfTheDice(): String {

        val sideOfBone = (1..quantitySideOfBone).random()
        return "Бросили кость с $quantitySideOfBone гранями.\n" +
                "Выпало число $sideOfBone"
    }
}

class BoneWithFourFaces : PropertyBone() {
    override val quantitySideOfBone = 4
}

class BoneWithSixFaces : PropertyBone() {
    override val quantitySideOfBone = 6
}

class BoneWithEightFaces : PropertyBone() {
    override val quantitySideOfBone = 8
}


fun main() {
    val bone4side: PropertyBone = BoneWithFourFaces()
    val bone6side: PropertyBone = BoneWithSixFaces()
    val bone8side: PropertyBone = BoneWithEightFaces()

    println(bone4side.rollOfTheDice())
    println()
    println(bone6side.rollOfTheDice())
    println()
    println(bone8side.rollOfTheDice())
}