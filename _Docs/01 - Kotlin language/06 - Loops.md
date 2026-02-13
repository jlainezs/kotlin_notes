# Loops

## for loop

### Ranges

A range is an expression of the form ``start..end``

We use ranges to define the loop index values

```
for (i in 1..10) {

}
```

We can also define a range by using the ``until`` keyword

```
for (i in 1 until 10) {

}
```
The difference with the previous ones is that ``1..10`` does 10 iterations but ``1 until 10`` does 9 iterations.

Note that the initial value must be lower than the final value.

If we need to iterate from upper values to lower values, we need to define a range using ``down to``

```
for (i in 10 downTo 1) {

}
```
Finally we may need to loop with increments differents than 1. For that purpose we can use ``step``

```
for (i in 1..10 step 2) {

}
```
This loop will run 5 times with indexes 1,3,5,7 and 9.

## while loop

Run the loop until a certain condition is reached (until a boolean expression evaluates false)

```
var number = 0
while (number < 10) {
    number++
}
```

The previous code will run 10 times, and number will change its value from 0 to 9.

## do while loop

Runs a loop evaluating an expression at the end of the loop.

```
var number = 0
 do {
    number++
} while (number < 10)
```
## Altering the loop flow

### labels

In nested loops we can define labels

```
var number = 0
outer@ while (number < 99) {
    number++
    var i = 0
    while (i < 5) {
    }
}
```
Those labels will be used to referenciate outer loops from inner loops. From outer to inner is not allowed. 

### continue

Use continue to move to the following loop iteration.

```
var number = 0
while (number < 10) {
    number++
    if (number == 7) {
        continue
    }
}
```

We can specify a label if needed

``continue@label``

### break

Use ``break`` to exit the loop.

```
var number = 0
while (number < 10) {
    number++
    if (number == 7) {
        break
    }
}
```

We can specify a label if needed

``break@label``

