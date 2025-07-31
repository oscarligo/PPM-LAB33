// 1. Clase food con propiedades name y price, y función abstracta cook()
abstract  class Food (val name: String, val price: Float)
{
     abstract fun cook(): String
}
