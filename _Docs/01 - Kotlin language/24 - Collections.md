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