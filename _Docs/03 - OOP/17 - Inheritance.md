# Inheritance

Define a base class and additional classes that extends functionallity on the base class.

Kotlin classes are final, so they can't be extended. To derive a class, the base class must be marked as ``open``.

```
open class BaseClass(){

}
class AClass():BaseClass(){

}
```

## Members visibility

Use visibility modifiers to allow use of members in derived classes.

- public
- protected
- private
- internal

## Overrides

To override a function it must be marked as ``open`` in the base class and the reimplemented function must be marked as ``override``.

To call to parent class members we use the ``super`` qualifier:

```
open class BaseClass(){
    fun myFunction(){}
}

class DerivedClass():BaseClass(){
    fun otherFunction(){
        super.myFunction()
        // more stuff
    }
}
```
