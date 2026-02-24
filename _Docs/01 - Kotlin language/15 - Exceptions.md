# Exceptions

Exceptions are a way to handle unexpected situations. In other words: they are a way to signal error situations at runtime.

Exceptions give us the opportunity to manage the error situation and recover the code flow or, gracefully, terminate our code execution.

## try..catch

To control exceptions, we should sorround the critical code with a try..catch block

```
try {
    // throws exception if b is zero
    println(a/b)
    .. more code not executed ..
} catch (e: ArithmeticException) {
    println("Trying to divide by zero.")
}
```
We can ``catch`` several exceptions.

```
try {
    // throws exception if b is zero
    println(a/b)
    .. more code not executed ..
} catch (e: ArithmeticException) {
    println("Trying to divide by zero.")
} catch(e: Exception) {
    ...
}
```
The first ``catch`` will will be executed if an ArithmeticException is raised. The last catch will be executed if any other exception is raised.

## finally

The flow jumps directly into the catch block when the exception is raised.

```
try {
    // do some risky thing
} catch {
    // handle the error
}
finally {
    println("This is going to be executed in spite of exception being raised.")
}
```

The finally block is executed after the try block and the catch block. It is executed always.

## try..catch..finally is an expression

We can assign a try..catch..finally block to a variable

```
val result = try {
    a/b
} catch {
    0
}
finally {
    println("Divide by zero.")
}

println(result)
```


