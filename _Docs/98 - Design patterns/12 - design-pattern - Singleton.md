# Singleton design pattern

Have one and only one instance of a class.

## With a companion object

We should declare the constructor as **private** and then, define a companion object who is responsible for creating the instance.

```
class MySingleton private constructor() {
    companion object {
        private var instance: MySingleton? = null

        fun getInstance() {
            if (instance == null) {
                instance = MySingleton()
            }

            return instance
        }
    }
}

fun useSingleton() {
    val instance = MySingleton.getInstance()
}
```

## With an object

The following code is equivalent to the preceeding one:

```
object MySingleton {
    init {
        println("Created!")
    }
}
```
