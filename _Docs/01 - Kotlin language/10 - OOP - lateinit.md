# Lateinit

Declare a member property and initializes it later.

This code reaises a compiler error

```
class User(var firstName: String){
    var favMovie: String
}
```

the property ``favMovie`` must be initialized, but sometimes we need to declare a member and initalize it later. The keywork ``lateinit`` allows us to declare those variables and left them with no initial value.

```
class User(var firstName: String){
    lateinit var favMovie: String
}
```

If we use the property before being initialized we will have a runtime error telling about the access to an unitialized property. Use the ``isInitialized`` property on the member property to check if the property has been initialized

```
class WeatherStation {
    lateinit var latestReading: String

    fun printReading() {
        // Checks whether the property is initialized
        if (this::latestReading.isInitialized) {
            println("Latest reading: $latestReading")
        } else {
            println("No reading available")
        }
    }
}
```

``lateinit`` is not allowed for primitive types like Int, Char and Boolean.

You can use the lateinit modifier on var properties declared as:
- Top-level properties.
- Local variables.
- Properties inside the body of a class.
