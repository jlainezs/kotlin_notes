import kotlin.concurrent.thread

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Thread 1 started")
    thread {
        println("Thread 2 started")
        Thread.sleep(1000)

        println("Thread 2 finished")
    }
    println("Thread 1 finished")
}