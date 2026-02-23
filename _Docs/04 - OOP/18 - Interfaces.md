# Interfaces

## Interface declaration

To declare interfaces in Kotlin we use the ``interface`` keyword. As usual, interfaces define operations signature but in Kotlin we may define a body.

```
interface MyInterface {
    fun funcion1()
    fun function2(){
        // some body
    }
}
```
## Interface implementation

Classes implement interfaces by inheriting from them

```
class MyClass:MyInterface{
    override function1() {

    }
}
```
## Properties

Properties can define properties

```
interface MyInterface {
    val prop: Int
    val implementedProp: String
        get()="foo"
}

class MyClass:MyInterface{
    override val prop: Int = 29
}
```

## Inheritance

It is possible to define a hierarchy of interfaces

```
interface BaseInt {
    val prop1: Int
}
interface MyInterface: BaseInt {
    val prop2: Int
}
class MyClass: MyInterface {
    override val prop1: Int = 20
    override val prop2: Int = 21
}
```
## Override conflicts

Two interfaces can define the same member signature then, the class, can refer to any of the inherited operations

```
interface A {
    fun f1() {
        // do things
    }
}
interface D {
    fun f1() {
        // do other things
    }
}
class MyClass: A,D{
    override fun f1(){
        super<A>.f1()
    }
    fun otherThings(){
        super<B>.f1()
    }
}
```
## Reference
- [Interfaces, Kotlin language guide](https://kotlinlang.org/docs/interfaces.html#jvm-default-method-generation-for-interface-functions)
- 