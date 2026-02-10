// Car class definition
class Car {
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

class User(firstName: String, var lastName: String, var age: Int) {
    // secondary constructors
    constructor(name: String): this(name, "User", 0){
        println("Secondary constructor called")
    }
    constructor(name: String, lastName: String): this(name, lastName, 0){
        println("Another secondary constructor called")
    }

    init {
        if (firstName.lowercase().startsWith("a")) {
            println("The name doesn't start with 'A' or 'a'")
        }
    }

    var firstName: String = firstName
        //get(){
        //    return field.uppercase()
        //}
        get() = field.uppercase()
        set(value) {
            field = value
        }

    fun info(){
        println("Name: $firstName, Last Name: $lastName, Age: $age")
    }
}

class LateUser(var firstName: String, var lastName: String, var age: Int) {
    lateinit var favoriteMovie: String
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int) = a + b
    }
}
