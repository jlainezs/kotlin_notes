fun main() {
    sayHello("Perico", 30)
    val r1 = getMax(10, 20)
    println(r1)
    val r2 = simpleGetMax(10, 20)
    val r3 = shortestGetMax(10, 20)
    println("All are the same value: $r1, $r2, $r3")

    val r4 = shortestGetMax(10.0, 20.0)
    println(r4)

    val r5 = getMax(10.0, 20.0, 30.0)
    println(r5)

    sendMessage("Perico", "Hello!")
    sendMessage("Perico")
}

fun sayHello(name: String, age: Int){
    println("Hello, $name! You are $age years old.")
}

fun getMax(a: Int, b: Int): Int
{
    val max = if (a > b) a else b
    return max
}

fun simpleGetMax(a: Int, b: Int): Int{
    return if (a > b) a else b
}

fun getMax(a: Double, b: Double, c: Double): Double {
    return if (a > b && a > c) {
        a
    } else if (b > a && b > c) {
        b
    } else {
        c
    }
}

fun shortestGetMax(a: Int, b: Int) =  if (a > b) a else b
fun shortestGetMax(a: Double, b: Double) =  if (a > b) a else b

fun sendMessage(name: String, message: String = "") {
    println("Message sent to $name: $message")
}
