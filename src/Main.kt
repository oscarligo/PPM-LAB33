//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    // 7. Extension Function para calcular el precio con descuento de un alimento
    fun Food.discountedPrice(): Float {
        return this.price * 0.70f
    }

    // 8. Instancia de distintos alimentos
    val hamburguesa = Burger("Hamburguesa con queso", 50.00f)
    val pizza = Pizza("Pizza Vegetariana", 100.00f)
    val jugo = Juice("Jugo Fresas", 20.00f)
    val helado = IceCream("Helado de chocolate", 10.00f)

    // 9. Función eat() del helado
    println("\n* Función eat() del helado:")
    println(helado.eat())

    // 10. Precio con descuento de la hamburguesa
    println("\n* Precio con descuento de la hamburguesa: Q.${hamburguesa.discountedPrice()}")

    // 11. Cómo se cocina cada alimento
    println("\n* Como cocinar cada alimento:")
    println("\nHamburguesa:\n${hamburguesa.cook()}")
    println("\nPizza:\n${pizza.cook()}")
    println("\nJugo:\n${jugo.cook()}")
    println("\nHelado:\n${helado.cook()}")











}