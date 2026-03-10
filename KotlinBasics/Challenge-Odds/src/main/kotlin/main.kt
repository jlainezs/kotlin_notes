fun main() {
    val numbers = (1..10)
    var evenCounter = 0

    println("Printing even numbers in the range:")
    for (number in numbers) {
        if (isEven(number)) {
            evenCounter++
            println(number)
        }
    }
    println("There are $evenCounter even numbers in the range")
}

// add a one line function to improve reading
fun isEven(number: Int) = number % 2 == 0
