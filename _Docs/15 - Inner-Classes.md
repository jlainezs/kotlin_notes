# Inner classes

Inner classes are classes defined inside another classes. They have access to properties defined in the class they are defined.

The declaration uses the ``inner`` keyword in front of the ``class``

```
class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}

///
val list = ListView(arrayOf("Item 1", "Item 2", "Item 3"))
list.ListViewItem().displayItem(1)

```
