// 5. Clase Abstracta Drink que hereda de Food y tiene una función abstracta pour()
abstract class Drink(name:String, price:Float): Food(name,price) {

    abstract fun pour(): String

}