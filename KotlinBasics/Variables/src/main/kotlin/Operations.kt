fun main(){
    val x = 5
    val y = 2

    val sum = x + y
    println("Sum is $sum")

    // results are Int bc operands are Int
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")
    println("----")

    val z = 2.0F
    // Now results are Float bc one operand is Float
    println("x + y = ${x + z}")
    println("x - y = ${x - z}")
    println("x * y = ${x * z}")
    println("x / y = ${x / z}")
    println("x % y = ${x % z}")
    println("----")

    var a = 1
    println("${a++}, but $a") // 1, 2
    println("${++a}, but $a") // 3, 3
}
