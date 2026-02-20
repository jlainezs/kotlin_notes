# Generics

We express a class parametrizing some type for its elements.

```
val numbers = mutableListOf<Int>(...)
```

Now, numbers, only allows to add integers.

```
numbers.add("aa") // error
```

## Implementing a generic class

To create a generic class, like in other languages, we define a class with a generic type

```
class Team<T>(val name: String) {
    val players = mutableListOf<T>()
    fun addPlayer(player: T) {
        players.add(player)
    }
}
```