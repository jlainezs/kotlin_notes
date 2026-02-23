# Abstract classes

An abstract class is declared with the ``abstract`` keyword.

Abstract classes cannot be instantiated and can only be inherited from other classes.

```
abstract class MyAbsClass(){

}

class MyConcretClass:MyAbsClass(){

}
```

Like interfaces, abstract classes can declare functions that must be implemented on descendant classes.

```
abstract class MyAbsClass(){
    // declare only header
    abstract fun AFunction()
}

class MyConcretClass:MyAbsClass(){
    override fun AFunction(){

    }
}
```

