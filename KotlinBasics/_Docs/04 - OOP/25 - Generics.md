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
class FootballPlayer(name:String): Player(name)
class SomeClass()
class Team<T: Player>(val name: String){
    ...
}
```

Now, ``Team`` only accepts types which are a ``Player`` or a descendant of it.

```
val footballTeam = Team<FootballPlayer>("")
val someClassTeam = Team<SomeClass>("") // won't compile, as SomeClass is not a Player or a descendant of Player
```

We can restrict generic type to interfaces.

```
class Team<T>(val name:String) where T:Player, T:AnInterface {
    ...
}
```

## Variance
co-variance & counter-variance

Variance is accepting subclasses (co) or superclasses (counter) as a type for a generic type argument.

## Type projection
## Type erasure

The generic parameter is only available at compile time, not at runtime:

```
val l: Any listOf<String>("aa")
if (l is listOf<String>)...
```

the condition will not compile and will raise an error telling that the type is erased.

The same situation happens inside a generic class: the generic type is not carried on runtime, and we can't check for generic type in functions:

```
fun <T> getSomeTypes(list: List<Any>): List<T> {
    val l = mutableList<T>()
    for (elem in list) {
        if (elem is T) {
            l.add(elem)
        }
    }
    return l
}
```
The type check want compile.

To avoid that error we use ``reified`` type parameters.

```
fun <reified T> getSomeTypes(list: List<Any>): List<T> {
    if (elem is T){ // now it works

    }
}
```
``reified`` types can only be used in ``inline`` functions.

Previous function is used on that way:

```
val l = getSomeTypes<Int>(aList)
```

## References

- [Generics: in, out, where - Kotlin language guide](https://kotlinlang.org/docs/generics.html)
- [Reified type parameters - Kotlin language guide](https://kotlinlang.org/docs/inline-functions.html#reified-type-parameters)