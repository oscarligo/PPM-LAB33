// 2. subclase de Food Pizza que sobreescribe la función cook()

class Pizza(name:String, price: Float): Food(name, price) {
    override fun cook(): String {
        return "Cómo hornea una pizza: " +
               "\n1. Precalentar el horno a 220°C." +
               "\n2. Preparar la masa y extenderla en una bandeja." +
               "\n3. Añadir salsa de tomate, queso y tus ingredientes favoritos." +
               "\n4. Hornear durante 15-20 minutos o hasta que esté dorada." +
               "\n5. Sacar del horno y dejar enfriar un poco."
    }
}