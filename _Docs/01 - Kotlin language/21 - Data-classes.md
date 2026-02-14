# Data classes

Data classes are used to, surprise, hold data.

## Declaration

We use the ``data`` keyword to declare a data class

```
data class User(val name: String, val age: Int)
```

## Added functions

Kotlin compiler automatically generates additional member functions to:

- print
- compare with reference (===) and value (==)
- copy



## References

- [Data classes, Kotlin official documentation](https://kotlinlang.org/docs/data-classes.html)
