//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = 5
    val b = 0

    try{
        println(a / b)
    } catch (e: ArithmeticException){
        println("Cannot divide by zero")
    } catch (e: Exception){
        println("An exception occurred")
    }
    finally{
        println("Finally block is always executed")
    }
}
