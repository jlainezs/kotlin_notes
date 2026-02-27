import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.cancellation.CancellationException

fun main(){
    println("Main starts: ${Thread.currentThread().name}")
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val job1 = launch {
            val result1 = getData1(Thread.currentThread().name)
            if (!isActive){
                return@launch
            }
            println("result1: $result1")
        }
        // We don't see result1 on console
        //job1.cancel()
        //job1.join() // wait for job1 to complete
        // or
        job1.cancelAndJoin()

        val job2 = launch {
            var result2 = ""
            try {
                result2 = getData2(Thread.currentThread().name)
                println("result2: $result2")
            } catch (e: CancellationException) {
                println("Cancellation exception caught: ${e.message}")
            } finally {
                println("job2 completed")
            }
            println("result2: $result2")
        }
        delay(1000) // give some time to start job2
        job2.cancelAndJoin()

        val job3 = launch {
            val result3 = getData3(Thread.currentThread().name)
            println("result3: $result3")
        }
    }

    runBlocking {
        parentJob.join()
    }
    parentJob.invokeOnCompletion {
        it?.let {
            println("Exception: ${it.message}")
        } ?: println("Job completed successfully")
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
private suspend fun getData3(threadName: String): String {
    println("getData3 starts: $threadName")
    delay(2000)
    println("getData3 ends: $threadName")
    return "Result 3"
}