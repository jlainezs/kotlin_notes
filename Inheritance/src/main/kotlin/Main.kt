//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val car = Car("Volvo", "Blue", 2, 4)
    val plane = Plane("Airbus", "Yellow", 4, 6)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String){
    open fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}

//  receive to params and define two additional properties
// pass the params to the base constructor as they are defined there as properties
class Car(name: String, color: String, val engine: Int, val doors: Int): Vehicle(name, color) {
}

class Plane(name: String, color: String, engine: Int, doors: Int): Vehicle(name, color){
    override fun move(){
        fly()
        super.move()
    }

    fun fly(){
        println("$name is flying")
    }
}
