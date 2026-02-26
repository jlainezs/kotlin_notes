# Threads

Idea of threads: do some work at the same time.

As default, Kotlin code runs on the main  thread. Some tasks can take some amount of time to be completed and block the main thread waiting for completion.

To avoid this blocking situation, we can use threads.

 To start a thread
 ```
 main thread
 thread {
     do some work
 }
 main thread
 ```

 Kotlin threads are closer to Java threads,

## Common problems with Thread:

- High creation and management cost: Threads consume significant system resources.
- Synchronization complexity: Controlling multiple threads manually can lead to bugs such as deadlocks.
- Blocking: Operations like Thread.sleep block the actual thread.

Despite these limitations, threads are still useful in scenarios where we need direct control.

## When to Use Thread in Kotlin ?
Although Kotlin offers coroutines as a more efficient solution for multitasking, the use of threads may still be necessary in some cases, such as:

- Integration with legacy code: Old Java libraries that rely on explicit threads.
- Low-level tasks: When you need full control over the execution and resources of the operating system.
- Simple applications: Scenarios where the complexity of coroutines is not necessary.


## References

- [Exploring the use of thread in Kotlin](https://dev.to/comunidadedevspace/exploring-the-use-of-thread-in-kotlin-4oj7)
