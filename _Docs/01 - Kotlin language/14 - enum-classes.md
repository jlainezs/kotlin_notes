# Enum classes

Define a class with a value set and, maybe, some functions.

```
enum class MyEnum {
    VAL1, VAL2
}
```
Enum classes also accept constructors:

```
enum class MyEnum(var param:String) {
    VAL1(param="value),
    VAL2(param="value)
}
```
## Iterate enum values
It is possible to build a loop to iterate over all enum values:

```
enum class MyEnum {
    VAL1, VAL2
}

// Before kotlin 1.9
// for (myEnum in MyEnum.values()){
// since Kotlin 1.9
for (myEnum in MyEnum.entries)
    // do your things here
}
```
The item follows the definition order of the enum values.

To access the values of the item instance we follow the dot sintax. Enum classes provide additional methods and properties to the enum values.

```
class MyEnum(var param: String) {
    VAL1(param = "Hello")
}
println(MyEnum.VAL1.param)
println(MyEnum.VAL2.name)
```

## Functions in enum classes
```
enum class MyEnum(var param:String) {
    VAL1(param="value),
    VAL2(param="value);

    func myFunc()
}
```
and the usage is
```
MyEnum.VAL1.myFunc()
```

Note the ``;`` after the enum values. Last enum value should be followed by a ``;`` if there are functions in the enum or a ``}`` to finish the enum declaration. 

## Use in variables
USe it as a simple type
```
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}
val dir = Direction.NORTH
```
We can also use an string to initialize the variable
```
val dir = Direction.valueOf("NORTH")
```
## When

```
when(dir) {
    NORTH->{doThings}
    SOUTH->{doThings}
    EAST->{doThings}
    WEST->{doThings}
}
```
