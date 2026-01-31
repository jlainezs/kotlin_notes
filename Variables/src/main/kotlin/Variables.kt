fun main(){
    // var state
    var userName: String = "Perico"
    var anotherUserName = "Perica" // no need to declare type as kotlin uses type inference, .
    val age:Int = 25 // val variables are inmutables. No need to declare variable type.

    userName = "John"
    println("Hello $userName, age $age!")
}
