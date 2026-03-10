fun main(){
    val number = 23
    println("The number is $number")

    var maxInteger = Int.MAX_VALUE
    val minInteger = Int.MIN_VALUE
    println("Max integer value is $maxInteger")
    println("Min integer value is $minInteger")

    // next expression causes an overflow at runtime
    // because the value exceeds Int.MAX_VALUE
    maxInteger += 1
    println("Max integer value after increment is $maxInteger")
}