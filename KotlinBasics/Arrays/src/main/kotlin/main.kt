fun main() {
    val names: Array<String> = arrayOf("a", "b", "c")
    println(names)
    println("First name is ${names[0]}")

    val data = arrayOf("a", "b", "c", 2, 3)

    for (item in data) {
        if (item is String) {
            println(item)
        }
    }
}
