//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
}

abstract class Vehicle() {
    abstract fun move()
    abstract fun stop()
}

class Car(var name: String, var color: String, val engines: Int, val doors: Int):Vehicle() {
    override fun move() {
        println("Car is moving")
    }
    override fun stop() {
        println("Car is stopped")
    }
}
