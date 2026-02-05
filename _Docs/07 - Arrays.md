# Arrays

To declare an array in Kotlin we need to specify a type parameter.

```
val names: Array<String> = arrayOf("a", "b", "c")
```
Thanks to type inference the previous declaration can be simplified:
```
val names = arrayOf("a", "b", "c")
```

Array index starts at 0. To acces an element in the array we use brackets

```
println(names[0])
```
We can reassign an element in the array
```
names[0]="D"
```

## Number of elements in the array

To know the number if items in an array, we can use ``array.size``, which returns an integer.

Note that size is one unit greater than the maximum index (as expected).

Any reference to an index that is defined in the array will produce an ``Index out of range`` exception.

In the previous array, if we try to get ``names[4]``, it will raise the error.

To prevent this exception, we should check the array size before accessing an item:

```
if (names.size < 3){
    // it is safe to access items 0..2 in the array
}
```

## Loop the array
A way of iterate trhough an array items is using a ``for..in`` loop
```
val numbers = arrayOf(1,2,3,4,5)
for (number in numbers) {

}
```

## Mixed types arrays

This array declaration is accepted
```
val data = arrayOf("a", "b", "c", 2, 3)
```

In that case we need to check item type before doing any actions using the keyword ``is`` which checks a variable type. The following example will print only the strings in the array:

```
for (item in data) {
    if (item is String) {
        println(item)
    }
}
```
