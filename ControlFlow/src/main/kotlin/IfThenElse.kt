fun main() {
    val isActive = true
    if (isActive) {
        println("Active")
    } else {
        println("Inactive")
    }

    println("----------------")

    val number = 10
    if (number >= 11){
        println("Number is greater than 11")
    } else {
        println("Number is less than 11")
    }

    if (number >= 11){
        println("Number is greater than 11")
    } else if (number == 10){
        println("Number is 10")
    } else {
        println("Number is less than 10")
    }

    // use a boolean operator
    if (isActive && number >= 11)
        println("Both conditions are true")
    else
        println("At least one of the conditions is false")

    // use NOT operator (!)
    if (!isActive)
        println("isActive is false")
    else
        println("isActive is true")

    println("----------------")

    // initializing a variable using a logical expression
    val textIsActive = if (isActive) {
        println("isActive is true")
        "Active" // assigned to textIsActive
    } else {
        println("isActive is false")
        "Inactive"
    }
    println(textIsActive)

    val thisIsAlsoCorrect = if (!isActive) "Active" else 12
    println(thisIsAlsoCorrect)
}
