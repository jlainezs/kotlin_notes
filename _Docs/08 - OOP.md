# OOP

Classes encapsulate data (state) and behaviour (functionallity) for objects.

## Class definition

```
class SampleClass {
    /* definition */
}
```
### Properties

Declare var / val variables inside the class.

```
class SampleClass {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0
}
```
### Methods

Declare and implement functions inside the class

```
class SampleClass {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The car $name ${this.model} is moving")
    }
}
```
``this`` it is referred to the current context.

### Constructors

Constructors are used to create instances of classes.

```
val aCar = Car()
```

#### Primary constructor

We can define parameters in the constructor. Those parameters become properties if they are declared with ``val`` or ``var``.

Properties declared in the primary constructor are accessible by member functions of the class

```
class Car(val name: String, val model: String, val color: String, val doors: Int) {
}
```
We can declare parameters in the constructor without ``val`` or ``var``, but they are only available inside the class body.
```
class AClassSample(theInstanceName: String){
    var name = theInstanceName;
}
```
This allows us to do some simple initialization.

## References

- [Classes, Kotlin language guide](https://kotlinlang.org/docs/classes.html)