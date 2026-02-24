# Lambdas

## High-order functions

A higher-order function is a function that takes functions as parameters, or returns a function.

## Function declaration

A function can be declared using an expression and then we can call it.

```
val aFunc = {
    a: Int, b: Int -> println("a + b = ${a+b}")
}

aFunc(1, 2)
```

## Anonymous function

In a similar way, we can pass a block of code to a function as a parameter

```
fun add(a: Int,b: Int, action: (Int) -> Unit) {
    action(a + b)
}
fun main() {
    add(1, 2, {a: Int -> println(a)})
}
```
It will show 3 on the console.

When the lambda is the last parameter in the function call, it can also be moved outside of the parentesis:

```
add(1,2) { a: Int -> println(a) }
```

## Implicit parameter

It is possible to omit parameter declaration on a lambda function and an implicit parameter

```
fun doSomething(str:String, myFunction: (String) -> String) {
    val uppercasedWord = myFunction(str)
    println(uppercasedWord)
}
doSomething("hello") { s:String -> s.uppercase() }
doSomething("hello") { it.uppercase() }
```

## Reference

- [High-order functions and lambdas, Kotlin language guide](https://kotlinlang.org/docs/lambdas.html)
