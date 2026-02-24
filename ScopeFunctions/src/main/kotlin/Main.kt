class User() {
    var firstName = ""
    var lastName = ""
    var age = -1
}

fun main() {
    val user = User()
    //user.firstName = "John"
    //user.lastName = "Doe"
    //user.age = 30
    with(user){
        firstName = "John"
        lastName = "Doe"
        age = 30
    }

    val otherUser = (User().apply {
        firstName = "John"
        lastName = "Smith"
        age = 32
    }).also {
        println(it)
    }
}
