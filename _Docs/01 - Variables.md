# Variables

## Primitive data types

- Byte
- Short
- Int
- Long
- Float
- Double
- Char
- Boolean
- String

## Variable declaration

- val: unmutable variable.
- var: mutable variable.

```
val myIntegerVariable: Int = 2
var myCharVariable: Char = 'A'
```

### Type inference

Kotlin is able to infere the type of a variable: there's no need to specify the variable data type when declaring variable.

The statement

```
val myIntegerVariable: Int = 2
```
has the same result as
```
val myIntegerVariable = 2
```
becuase `myIntegerVariable` is assumed to be Int.
