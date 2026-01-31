# Flow control

## if

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

- [Conditions and loops](https://kotlinlang.org/docs/control-flow.html)
