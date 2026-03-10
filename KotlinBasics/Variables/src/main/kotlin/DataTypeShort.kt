fun main(){
    var maxShort = Short.MAX_VALUE
    val minShort = Short.MIN_VALUE
    println("Max Short value is $maxShort")
    println("Min Short value is $minShort")

    // next expression fails
    // because 1 is taken as Int
    // maxShort += 1

    println("Max Short value after increment is $maxShort")
}