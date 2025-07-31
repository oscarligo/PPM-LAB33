abstract class food (
    val eat: Int,
    val price: Float
) {

    abstract fun cook(): String = "Cooking food with price $price and eat $eat"
}
