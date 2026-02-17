fun list(){
    val il = listOf("A", "B")
    il.forEach { println(it) }
    println("----")

    val l = mutableListOf<String>("A", "B")
    l.add("C")
    l.forEach { println(it) }
    l.remove("A")
    l.forEach { println(it) }
}

fun map(){
    val m = mapOf<Int,String>(1 to "A", 2 to "B")
    println(m[1])

    m.forEach { println("${it.key} -> ${it.value}") }
    m.forEach { u, v -> println("${u} -> ${v}") }
    println("----")

    val m1 = mutableMapOf<Int,String>(1 to "A", 2 to "B")
    // add
    m1[2] = "C"
    m1.forEach { println("${it.key} -> ${it.value}") }
}

fun set(){
    val s = setOf<String>("A", "B")
    println(s.contains("A"))
    println("----")

    val ms = mutableSetOf<String>("A", "B")
    ms.add("C")
    println(ms.contains("C"))
    ms.add("C")
    ms.forEach { println(it) }
    ms.remove("A")
    ms.forEach { println(it) }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    list()
    println("=======")
    set()
    println("=======")
    map()
}

class User(val name: String)