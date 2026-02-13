# Null values

Kotlin variables are always initialized to the zero value of the variable type

| type   | Zero value |
|--------|------------|
| Int    | 0          |
| String | ""         |

We can force a variable to take a null value, but we need to explicitly tell it to Kotlin:

```
var num: String? = null
```

We use the ``?`` to mark the variable as ``nullable``.

## Safe call operator

When accessing objects methods or propertoes, we can ensure an object is not null by using the safe call operator:

```
someObject?.Property
```

## Non-null asserted operator

```
someObject!!.Property
```

## Elvis operator

```
val text: String? = null
val text2 = text ?: "Some text"
```
If text is null (which it is), it will assign "Some text" to text2.

The following example will assign "Not null" to text2:

```
val text: String? = "Not null"
val text2 = text ?: "Some text"
```
