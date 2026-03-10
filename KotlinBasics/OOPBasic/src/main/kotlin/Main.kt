enum class DirectionSimple{
    NORTH, SOUTH, EAST, WEST
}

enum class Direction(var direction: String, var distance: Int){
    NORTH("North", 1),
    SOUTH("South", 1),
    EAST("East", 1),
    WEST("West", 1);

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}

class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}

fun main(args: Array<String>) {
    val list = ListView(arrayOf("Item 1", "Item 2", "Item 3"))
    list.ListViewItem().displayItem(1)
}
