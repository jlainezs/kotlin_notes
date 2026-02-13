# Functions

Functions are declared with the ``fun`` keyword followe by thename function and its (optional) arguments. Argument type must be explicitly declared after the parameter name.

```
fun useNoArguments(){
    ...do things
}

fun usingArguments(arg1: type1, arg2: type2, ...){
    ...do things
}
```

Function arguments are inmutable (like a ``val`` variable declaration) and scoped inside the function body.

Functions can return some data. The returning type must be declared after the arguments list:

```
fun myFunction(argument1: String): Int {
    ... do stuff
    return 1
}
```
To return the value we use the ``return`` keyword. Return continues the execution after the calling point.

## Function overload

Functions can be overloaded.

To overload a function, we declare it again with different arguments:

```
fun myFunction(argument1: String): Int {
    ... do stuff
    return 1
}
fun myFunction(argument1: Int): Int {
    ... do stuff
    return 1
}
```

Instead of changing the arguments type we can add (or remove) parameters:

```
fun myFunction(argument1: String): Int {
    ... do stuff
    return 1
}
fun myFunction(argument1: String, argument2: Int): Int {
    ... do stuff
    return 1
}
```
## Parameters default value

Parameters can have default values

```
fun myFunction(arg1: String, arg2: String = "Default value"): Int {
    ...
}
```
Then we can call the function specifying the arguemnt:

```
val r = myFunction("First argument")
val r1 = myFunction("First", "Second")
```
A parameter default value can be any expression result.

```
fun sample(arg1: String, arg2: String = defVal()): String
{

}
fun defVal(): String {
    return "XX"
}
```

## Named parameters

When calling a function we can specify the value of each parameter by assigning a value to the parameter name. Named parameters allows to change the parameter order in the function call.

```
fun myFunction(arg1: String, arg2: String = "Default value"): Int {
    ...
}

val r = myFunction(arg1 = "A", arg2 = "B")
val r = myFunction(arg2 = "A", arg1 = "B")

```

## Vararg

If the number of parameters we are going to need is unkown, we can use a vararg argument

```
fun myFunction(vararg numbers:Int): Int {

}

myFunction(1,2)
myFunction(1,2,3,4)
```

## Main and its parameter

The function ``main`` can receive one parameter of type ``Array<String>``

## References

- [Functions, Kotlin language guide](https://kotlinlang.org/docs/functions.html)
