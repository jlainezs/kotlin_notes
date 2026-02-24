//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun add(a: Int, b: Int) {
    println("a + b = ${a + b}")
}

fun implicitParameter(str:String, myFunction: (String) -> String) {
    val uppercasedWord = myFunction(str)
    println(uppercasedWord)
}

fun main() {
    add(1, 2)
    val addAsLambda = {
        a: Int, b: Int ->
        println("a + b = ${a + b}")
    }

    addAsLambda(1, 2)

    //implicitParameter("hello") { s:String -> s.uppercase() }
    implicitParameter("hello") { it.uppercase() }
}
