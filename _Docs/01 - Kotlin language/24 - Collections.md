# Collections

List, set and map. Are generic types.

- Mutable: add or remove elements
- Inmutable: elements are only added on creation and it is not possible to remmove elements from the collection.
## List
### Inmutable list

```
val list = listOf<String>("Item1", "Item2", "Item3")
```
To get an element we use index notation

```
println(list[0])
```

### Mutable list

```
val list = mutableListOf<string>("Item1", "Item2", "Item3")
```
#### Add items

```
list.add("Item4")
```
### Remove items
```
list.remove("Item1")
list.removeAt(1)
```
## Set
A Map does no allows to repeat elements, so it holds **unique** elements considering if an instance A is equal to an instance B, so literally it does the check ``A.equals(B)``.

### Inmutable set
```
val s = setOf<String>("A", "B", "C")
```
### Mutable set
```
val s = mutableSetOf<String>("A", "B", "C")
s.add("C")
s.remove("A")
```
## Map
The purpose of a map is to store (key,value) pairs. When declaring a map we must provide the key type and the elements type.

Elements are constructed by defining the relation between an key and the item using the ``to`` keyword: ``1 to "Item"``

To access an element in the map we use the key in index notation:

```
println(m[0])
```

When iterating a map, we can refer to key or value item.
```
m.forEach { println("${it.key} -> ${it.value}") }
```
or
```
m.forEach { u, v -> println("${u} -> ${v}") }
```
### Inmutable map
```
val users = mapOf<Int,String>(1 to "user1", 2 to "user2")
```
### Mutable map
```
val users = mutableMapOf<Int,String>(1 to "user1", 2 to "user2")
users.
```
Adding an element to a mutable map
```
m[10] = "value"
```
To remove an element
```
m.remove(1)
```

## Filtering

Get a subset of a collection by evaluating its elements.

- list.filter
- list.filterIndex
- list.filterNot

When filtering on a list or a set we get a list. The result of filtering a map is a map.

Filter functions accept a predicate for the boolean expression to use when evaluating each element.

```
val l = listOf("AA", "B", "CCC")
val filtered = l.filter { it.length > 2 }
```

On maps, the predicate element can check the key and the value of the item

```
val m = mapOf<Int, String>(1 to "A", 2 to "BB")
val m1 = m.filter {it.key > 0 && it.value.length > 1}
```

## Partitions

Partitions are a kind of filter which keep not matching items on a separate list, so you have a pair of lists as a result. Partitions are only available on lists.

```
val numbers = listOf(1,2,3,4)
val (even, odd) = numbers.partition { it % 2 == 0 }
```

## Testing predicates

Those are functions that test the predicate over the collection elements.

- list.Any : returns true if any of the elements matches the predicate.
- list.None: returns true if none of the elements matches the predicate.
- list.All: returns true when all the elements match the predicate.

## + and - operators
Kotlin defines + and - operators on collections.
The + operator is an alternative to the .add method

```
val l = mutableListOf(1,2,3,4,5)
val l1 = l + 6
```

We can also add or remove a list of items from a list

```
val l2 = l - mutableListOf(2,3)
```
## Grouping

Group returns a map where:

- Key: is the predicate value
- Value: is a list of items that matches the predicate

We can also apply a transformation on the value

```
val numbers = listOf("one", "two", "three", "four", "five")
val g = numbers.groupBy { it.first().uppercase() }
println(g)
println("----")
val g2 = numbers.groupBy(
    keySelector = { it.first().uppercase() },
    valueTransform = { it.uppercase() }
)
println(g2)
println("----")
```

## References

- [Partition map in Kotlin](https://dev.to/pfilaretov42/tiny-partition-map-in-kotlin-23ol)
