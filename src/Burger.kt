// 2. subclase de Food Burger que sobreescribe la función cook()
class Burger(name: String, price: Float): Food(name, price)

{
    override fun cook(): String {
        return "Como asar una hamburguesa" +
                "\n1. Preparar la carne molida con especias." +
                "\n2. Formar las hamburguesas." +
                "\n3. Cocinar en la parrilla o sartén." +
                "\n4. Tostar el pan." +
                "\n5. Agregar  lechuga, tomate y cebolla."

    }

}
