fun main(args: Array<String>) {

    // range
    for (i in 1..10) {
        println("i = $i")
    }

    for (i in 1 until 10){
        println("until i = $i")
    }

    for (i in 10 downTo 1) {
        println("downTo i = $i")
    }

    for (i in 1..10 step 2) {
        println("with step 2: i = $i")
    }

    for (i in 1 until 10 step 2) {
        println("with step 2: i = $i")
    }

    for (i in 10 downTo 1 step 2) {
        println("downTo i = $i")
    }


}