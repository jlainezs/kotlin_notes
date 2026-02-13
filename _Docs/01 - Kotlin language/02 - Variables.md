# Variables


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

## Operators
### Assignment operator

Kotlin uses `=` simbol to assign values to a variable.

### Arithmetic
Primitive numeric types has defined those basic operators:
- +: sum
- -: difference
- *: mutiplication
- /: division
- %: modulus

Operator precedence is the natural. Parenthesis are used to alter precedence:

- 2 + 3 * 2 = 8
- (2 + 3) * 2 = 10

### Increment operator

The operator `++` is used to increment a numeric variable with 1.

### Decrement operator

The operator `--` is used to increment a numeric variable with 1.

### Postfix / Prefix increment or decrement

Increment and decrement operators can be used in prefix or postfix notation:

- Prefix: increments the value of the variable and returns it
- Postfix: returs the value of the variable and increments it

```
var x = 1
println("${x++}") // 1
println("$x") // 2
println("${++x}") // 3
println("$x") // 3
```
### Boolean operators

- == : two operands are equal
- ! : NOT operator
- != : difference
- && : boolean AND
- || : boolean OR

Numeric variables also accepts comparisons:

- > : greather than
- >= : greather than or equal
- < : less than
- <= : less than or equal

