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

fun filtering(){
    val l = listOf(1, 2, 3, 4, 5)
    val l2 = l.filter { it % 2 == 0 }
    println(l2)
    println("----")

    val numbers = listOf(1, 2, 3, 4, 5)
    val filterIndex = numbers.filterIndexed { index, value -> index % 2 != 0 && value % 2 == 0 }
    println(filterIndex)
    println("----")
    val filteredNot = numbers.filterNot { it % 2 == 0 }
    println(filteredNot)
    println("----")
}

fun partition(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val (even, odd) = numbers.partition { it % 2 == 0 }
    println(even)
    println(odd)
    println("----")
}

fun testing(){
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.any { it % 2 == 0 })
    println(numbers.none { it == 0 })
    println(numbers.all { it < 10 })
}

fun grouping(){
    val numbers = listOf("one", "two", "three", "four", "five")
    val g = numbers.groupBy { it.first().uppercase() }
    println(g)
    println("----")
    val g2 = numbers.groupBy(
        keySelector = { it.first().uppercase() },
        valueTransform = { it.uppercase() }
    )
    println(g2)
    println("----")
}

fun main() {
    list()
    println("=======")
    set()
    println("=======")
    map()
    println("=======")
    filtering()
    println("=======")
    partition()
    println("=======")
    testing()
    println("=======")
    grouping()
}

class User(val name: String)