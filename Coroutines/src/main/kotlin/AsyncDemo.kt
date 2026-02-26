import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val j1: Deferred<String> = async {
            getData1(Thread.currentThread().name)
        }
        val j2: Deferred<String> = async {
            getData2(Thread.currentThread().name)
        }
    }

    runBlocking {
        parentJob.join()
    }

    parentJob.invokeOnCompletion {
        it?.let{
            println("Exception: ${it.message}")
        } ?: println("No exception occurred")
    }
    println("Main ends: ${Thread.currentThread().name}")
}

private suspend fun getData1(threadName: String): String {
    println("getData1 starts: $threadName")
    delay(2000)
    println("getData1 ends: $threadName")
    return "Result 1"
}
private suspend fun getData2(threadName: String): String {
    println("getData2 starts: $threadName")
    delay(2000)
    println("getData2 ends: $threadName")
    return "Result 2"
}