 class Juice (name: String, price: Float) : Drink(name, price) {

    override fun cook(): String {
        return "Como exprimir un jugo: cortar la fruta, exprimirla y servirla"
    }

    override fun pour(): String {
        return "Vertiendo jugo"
    }
}