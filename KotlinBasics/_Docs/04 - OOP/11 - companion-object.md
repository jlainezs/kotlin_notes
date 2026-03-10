# Companion Object

A companion object is the way of define static functions in Kotlin.

A class companion object is declared inside the class

```
class MyClass(){
    companion object {
        fun doSomething() {

        }
    }
}
```

Then we can use the ``doSomething`` method without the need to instantiate an object:

```
MyClass.doSomething()
```

Companion object methods can't be used on instances, as they belong to the class, not to an instance.

We can also define properties on companion objects:

```
class MyClass(){
    companion object {
        var max = 100
    }
}
```
