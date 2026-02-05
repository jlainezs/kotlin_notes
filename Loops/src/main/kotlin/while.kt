fun main(){
    var number = 0
    while (number < 10) {
        println(number)
        number++
    }

    println("----")
    number = 10
    do {
        println(number)
        number--
    } while (number > 0)

    println("----")
    number = 0
    while (number < 10) {
        number++
        if (number == 7) {
            continue
        }
        println(number)
    }

    println("----")
    number = 0
    while (number < 10) {
        number++
        if (number == 7) {
            break
        }
        println(number)
    }

}
