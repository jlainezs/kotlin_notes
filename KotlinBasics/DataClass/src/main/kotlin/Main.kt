//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user1 = User("John", "Doe", 25)
    val user2 = User("John", "Doe", 25)
    val user3 = User("Jane", "Doe", 25)
    val dummy = ""

    println(user1 == user1)
    println(user1 == user2)  // equivalent to user1.equals(user1)
    println(user1 == user3)

    println(user1)

    val dataUser1 = DataUser("John", "Doe", 25)
    val dataUser2 = DataUser("John", "Doe", 25)
    val dataUser3 = DataUser("Jane", "Doe", 25)

    println(dataUser1 == dataUser1)
    println(dataUser1 == dataUser2)
    println(dataUser1 == dataUser3)

    println(dataUser1)
}

class User(var firstName: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is User) return false

        return firstName == other.firstName
                && lastName == other.lastName
                && age == other.age
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
    }


data class DataUser(var firstName: String, var lastName: String, var age: Int){}
