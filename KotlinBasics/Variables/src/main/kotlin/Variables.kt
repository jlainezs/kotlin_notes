fun main(){
    // no need to initialize as it is overwritten before reading
    var userName: String = "Perico"
    val anotherUserName = "Perica" // no need to declare type as kotlin uses type inference, .
    val age:Int = 25 // val variables are inmutable.

    // userName can be reassigned: it is a var variable
    userName = "John"
    println("Hello $userName, age $age!")
    println("Another user name: $anotherUserName")

    // age = 32 // age cannot be reassigned: it is a val variable

    // val variables can be declared without declaring its type as kotlin uses type inference
    val v = 10
    println(v)
}
