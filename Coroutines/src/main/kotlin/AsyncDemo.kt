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
