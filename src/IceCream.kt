// 4. Clase IceCream que implementa la interfaz Dessert y hereda de Food
class IceCream(name: String, price: Float ): Food(name, price), Dessert {

    override fun cook(): String {
        return "Como enfriar un helado:" +
                "\n1. Mezclar ingredientes: leche, azúcar, crema y saborizantes." +
                "\n2. Batir la mezcla hasta que esté suave." +
                "\n3. Verter en un recipiente y congelar." +
                "\n4. Revolver cada 30 minutos hasta que esté cremoso." +
                "\n5. Servir con toppings al gusto."
    }

    override fun eat(): String {
        return "Comiendo helado"
    }



}