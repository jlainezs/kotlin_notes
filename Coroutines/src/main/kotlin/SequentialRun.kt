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
            println("result1: $result1")
        }

        job1.join()

        val job2 = launch {
            var result2 = ""
            result2 = getData2(Thread.currentThread().name)
            println("result2: $result2")
        }
        delay(1000)
        job2.join()

        val job3 = launch {
            val result3 = getData3(Thread.currentThread().name)
            println("result3: $result3")
        }.join()
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
