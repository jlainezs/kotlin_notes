fun main(args: Array<String>){
    println(sum(1, 2, 3))
    println(sum(1, 2, 3, 4, 5))
    println(sum(1, 2, 3, 4, 5, 6, 7))

    println(sum2(1, 2, 3))
    println(sum2(1, 2, 3, 4, 5))
    println(sum2(1, 2, 3, 4, 5, 6, 7))
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}
fun sum2(vararg numbers: Int): Int {
    var result = 0
    numbers.forEach { result += it } // it is the current element in the iteration
    return result
}
