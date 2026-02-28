import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() { // executed on the main Thread
    println("Main program strats: ${Thread.currentThread().name}")

    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(2000)
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    runBlocking {
        parentJob.join() // a suspended function can only be called from a coroutine or another suspended function
    }

    println("Main program ends: ${Thread.currentThread().name}")
}
