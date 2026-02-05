package challenge

fun main(){
    val a = arrayOf(1,2,3,4,5)

    println(minmax(a, true))
    println(minmax(a, false))
    println(minmaxOneLine(a, false))
    println(minmaxOneLine(a, true))
}

fun max(a:Array<Int>):Int {
    var max = a[0]

    for (number in a){
        if (number > max) {
            max = number
        }
    }

    return max
}

fun min(a:Array<Int>):Int {
    var min = a[0]

    for (number in a){
        if (number < min) {
            min = number
        }
    }

    return min
}

fun minmax(a:Array<Int>, useMax: Boolean):Int {
    return if (useMax) max(a) else min(a)
}

// minmax short version
fun minmaxOneLine(a:Array<Int>, useMax: Boolean):Int = if (useMax) max(a) else min(a)

