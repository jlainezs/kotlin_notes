import kotlinx.coroutines.delay

suspend fun getData1(threadName: String): String {
    println("getData1 starts: $threadName")
    delay(2000)
    println("getData1 ends: $threadName")
    return "Result 1"
}
suspend fun getData2(threadName: String): String {
    println("getData2 starts: $threadName")
    delay(2000)
    println("getData2 ends: $threadName")
    return "Result 2"
}
suspend fun getData3(threadName: String): String {
    println("getData3 starts: $threadName")
    delay(2000)
    println("getData3 ends: $threadName")
    return "Result 3"
}