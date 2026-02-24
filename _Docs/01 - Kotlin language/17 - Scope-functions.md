# Scope functions

Kotlin scope functions are special functions that allow you to execute a block of code within the context of an object, making your code more concise and readable. The five main scope functions are

- let
- run
- with
- apply
- also

each serving different purposes in how they handle the context object and return values.

They take as arguments an object and a lambda.

```
val usr = User()
with(usr){
    // now we are on User context
    firstName = "John"
    lastName = "Smith"
}
```
Some scope functions can return an expression (lambda result)

```
val n: Int = with(usr){
    // now we are on User context
    firstName = "John"
    lastName = "Smith"
    23
}
```

Now n evaluates to 23

## References

- [Scope functions, Kotlin programming language](https://kotlinlang.org/docs/scope-functions.html)
