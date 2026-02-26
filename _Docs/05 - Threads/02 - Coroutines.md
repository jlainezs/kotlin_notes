# Coroutines

Applications often need to perform multiple tasks at the same time, such as responding to user input, loading data, or updating the screen. To support this, they rely on concurrency, which allows operations to run independently without blocking each other.

The most common way to run tasks concurrently is by using threads, which are independent paths of execution managed by the operating system. However, threads are relatively heavy, and creating many of them can lead to performance issues.

To support efficient concurrency, Kotlin uses asynchronous programming built around coroutines, which let you write asynchronous code in a natural, sequential style using suspending functions. Coroutines are lightweight alternatives to threads. They can suspend without blocking system resources and are resource-friendly, making them better suited for fine-grained concurrency.

Most coroutine features are provided by the kotlinx.coroutines library, which includes tools for launching coroutines, handling concurrency, working with asynchronous streams, and more.

## Basics

To create applications that perform multiple tasks at once, a concept known as concurrency, Kotlin uses coroutines. A coroutine is a suspendable computation that lets you write concurrent code in a clear, sequential style. Coroutines can run concurrently with other coroutines and potentially in parallel.

On the JVM and in Kotlin/Native, all concurrent code, such as coroutines, runs on threads, managed by the operating system. Coroutines can suspend their execution instead of blocking a thread. This allows one coroutine to suspend while waiting for some data to arrive and another coroutine to run on the same thread, ensuring effective resource utilization.

## Suspending functions

The most basic building block of coroutines is the suspending function. It allows a running operation to pause and resume later without affecting the structure of your code.

To declare a suspending function, use the suspend keyword:

```
suspend fun greet() {
    println("Hello world from a suspending function")
}
```

You can only call a suspending function from another suspending function.

While the suspend keyword is part of the core Kotlin language, most coroutine features are available through the kotlinx.coroutines library.

## Comparison: Thread vs. Coroutines

| Appearance    | 	Thread                    | Coroutines              |
|---------------|----------------------------|-------------------------|
| Management    | Operating System           | Kotlin                  |
| Creation cost | High                       | Low                     |
| Scalability   | Limited                    | Highly scalable         |
| Blocking      | Yes, it can block threads. | No, it uses suspension. |

## References

- [Coroutines, Kotlin language guide](https://kotlinlang.org/docs/coroutines-overview.html)
-