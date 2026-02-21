# Conditional execution

## if

Note Kotlin defines ``if..else`` as an expression, not an statement.

```
if (<expression>) {
    // do something when expression evaluates true
} else {
    // do something otherwise
}
```

We can add more `if` in the `else` part:

```
if (<expression>) {
    // do something when expression evaluates true
} else if (<another_expression>){
    // expression is false
    // AND another_expression is true
} else {
    // expression is false
    // AND another_expression is false
}
```

## References

- [Conditions and loops]c/docs/control-flow.html)
