package lesson19

class Product(
    val id: Int,
    val nameProduct: String,
    val categoryProduct: Int,
) {
    fun infoProduct() {
        println(
            "ID товара: $id\n" +
                    "Название товара: $nameProduct\n" +
                    when (categoryProduct) {
                        CategoryProduct.WEAR.id -> CategoryProduct.WEAR.nameCategory()
                        CategoryProduct.OFFICE_SUPPLIES.id -> CategoryProduct.OFFICE_SUPPLIES.nameCategory()
                        CategoryProduct.OTHER.id -> CategoryProduct.OTHER.nameCategory()
                        else -> "Опаньки. Что то новое!"
                    }
        )
    }
}

fun main() {
    val tshirt = Product(
        1,
        "Футболка",
        1,
    )
    val paperClip = Product(
        2,
        "Скрепка",
        2,
    )
    val hammer = Product(
        3,
        "Молоток",
        3,
    )
    val bird = Product(
        4,
        "Соловей",
        4,
    )

    tshirt.infoProduct()
    println()
    paperClip.infoProduct()
    println()
    hammer.infoProduct()
    println()
    bird.infoProduct()
}

enum class CategoryProduct(val id: Int) {
    WEAR(1) {
        override fun nameCategory(): String {
            return "Название категории: Одежда"
        }
    },
    OFFICE_SUPPLIES(2) {
        override fun nameCategory(): String {
            return "Название категории: Канцелярские товары"
        }
    },
    OTHER(3) {
        override fun nameCategory(): String {
            return "Название категории: Прочее"
        }
    };

    abstract fun nameCategory(): String
}