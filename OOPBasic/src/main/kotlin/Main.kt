// Simple car class definition
class SimpleCar {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        // Use to class properties
        println("The car $name ${this.model} is moving")
    }

    fun stop(){
        println("The car $name has stopped")
    }
}

// Class with primary constructor
class ConstructorCar(
    val name: String,
    val model: String,
    val color: String,
    val doors: Int) {

    fun info(){
        println("The car is $name $model $color with $doors doors")
    }

    fun move(){
        println("The car $name ${this.model} is moving")
    }
}

fun useSimpleCar(){
    // instantiate a Car
    val car1 = SimpleCar()

    // set properties
    car1.name = "BMW"
    car1.model = "M5"
    car1.color = "Blue"
    car1.doors = 2

    // get properties
    println("The car is ${car1.name} ${car1.model} ${car1.color} with ${car1.doors} doors")

    // call methods
    car1.move()
    car1.stop()

    // another instance
    val car2 = SimpleCar()
    car2.name = "Mercedes"
    car2.model = "C200"
    car2.color = "Black"
    car2.doors = 4
    println("The car is ${car2.name} ${car2.model} ${car2.color} with ${car2.doors} doors")
    car2.move()
    car2.stop()
}

fun useConstructorCar(){
    val car1 = ConstructorCar("BMW", "M5", "Blue", 2)
    val car2 = ConstructorCar("Mercedes", "C200", "Black", 4)
    car1.info()
    car1.move()
    car2.info()
    car2.move()
}

fun main(args: Array<String>) {
    useSimpleCar()
    println()
    useConstructorCar()
}
