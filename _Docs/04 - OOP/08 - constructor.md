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

We can also define parameters and properties in the constructor.

#### Primary constructor

The Class primary constructor is the default class constructor.

#### Secondary constructors
It is possible to define more constructors in a class using the keywork  `constructor`. Additional constructors follow the rules of function overload, so they need to use different parameters count or types.
Secondary constructors only accept parameters and they need to call the primary constructor.

```
class A(var param1: Int){
    constructor(param1: Int, param2:String){}
    constructor(param2: String)
}
```

### Initializer blocks

Initializer blocks are executed when an object instance is going to be created. They are defined using the ``init`` keyword and we can define as many as needed.

```
class A(var param1:Int){
    init {
        ... some initialization
    }
    init {
        ... more initialization
    }
}
```

Init blocks are executed in the same order they are defined.

### Default property values

It is similar to parameter default value.

```
class A(var prop1:String = "X"){}
val i1 = A("Y")  // i1.prop1 == "Y"
val i2 = A() // i2.prop1 == "X"
```
### Named arguments

We can use named arguments when calling constructors

```
class A(var prop1:String = "X", var prop2:String){}
val i1 = A(prop2 = "Y", prop1 = "Z")
```


## References

- [Classes, Kotlin language guide](https://kotlinlang.org/docs/classes.html)