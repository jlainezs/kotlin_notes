import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    println("Main starts: ${Thread.currentThread().name}")
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        launch {
            val result1 = getData1(Thread.currentThread().name)
            println("result1: $result1")
        }
        launch {
            val result2 = getData2(Thread.currentThread().name)
            println("result2: $result2")
        }
    }

    runBlocking {
        parentJob.join()
    }
    println("Main ends: ${Thread.currentThread().name}")
}
