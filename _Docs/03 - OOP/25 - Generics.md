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

## Constraints

We can restrict the type used in a generic class.

```
class Player(val name: String)
class FootballPlayer(): Player
class SomeClass()
class Team<T: Player>(val name: String){
    ...
}
```

Now, ``Team`` only accepts types which are a ``Player`` or a descendant of it.

```
val footballTeam = Team<FootballPlayer>("")
val someClassTeam = Team<SomeClass>("") // won't compile, as SomeClass is not a Team or a descendant of Team
```

We can restrict generic type to interfaces.


## References

- [Generics: in, out, where - Kotlin language guide](https://kotlinlang.org/docs/generics.html)
