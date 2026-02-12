enum class DirectionSimple{
    NORTH, SOUTH, EAST, WEST
}

enum class Direction(var direction: String, var distance: Int){
    NORTH("North", 1),
    SOUTH("South", 1),
    EAST("East", 1),
    WEST("West", 1)

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}

fun main(args: Array<String>) {
    println(DirectionSimple.NORTH)
    println(Direction.NORTH)
    println("--")
    for (direction in Direction.entries) {
        println(direction)
    }
    println(Direction.NORTH.name)
    Direction.NORTH.printData()
}

