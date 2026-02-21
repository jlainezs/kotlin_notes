# Sealed classes

All direct subclasses of a sealed class are known at compile time. No other subclasses may appear outside the module and package within which the sealed class is defined. The same logic applies to sealed interfaces and their implementations: once a module with a sealed interface is compiled, no new implementations can be created

## Declaration

Add the ``sealed`` keyword infront of the ``class`` or ``interface`` keywords.

```
sealed interface MyInterface{}
sealed class MyClass(){}
```
## Instantiation

Sealed classes are always abstract, so no direct instantiation can be done. We can instantiate inner classes

```
sealed class MyClass(){
    fun f1(){}

    class A(){}
    class B(){}
}

val AInstance: MyClass = MyClass.A()
val BInstance: MyClass = MyClass.B()

fun main(){
    AIntance.f1()
    BIntance.f1()
}
```
## When

Sealed classes can be used like enums

```
sealed class Info(val message:String){
    fun showMessage(){
        println(message)
    }
    class Success(message: String)
    class Fail(message: String)
}
fun showInfo(info:Info){
    when (info){
        is Info.Success -> result.showMessage()
        is Info.Fail -> result.showMessage()
    }
}
```

## References

-[Sealed classes and interfaces, Kotlin porgraming language](https://kotlinlang.org/docs/sealed-classes.html)

