fun main(){
    var maxLong = Long.MAX_VALUE
    val minLong = Long.MIN_VALUE
    val anotherLong = 2L // Note the L suffix for long literal

    println("Max Long value is $maxLong")
    println("Min Long value is $minLong")
    println("Another Long value is $anotherLong")

    // next expression fails because adding 1 to Long.MAX_VALUE causes an overflow
    maxLong += 1

    println("Max Long value after increment is $maxLong")
}
