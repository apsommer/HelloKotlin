package directions

import kotlin.math.absoluteValue

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {

    var path = mutableListOf(Direction.START)

    val north = {path.add(Direction.NORTH)}
    val south = {path.add(Direction.SOUTH)}
    val east = {path.add(Direction.EAST)}
    val west = {path.add(Direction.WEST)}

    val map = Location()

    val end = {
        path.add(Direction.END)
        println("Game over.")
        println("Path: $path")
        path.clear()
        false
    }

    fun move (where: () -> Boolean) {
        where()
    }

    fun makeMove(arg : String?) {
        when (arg) {
            "n" -> { move(north); map.updateLocation(Direction.NORTH) }
            "s" -> { move(south); map.updateLocation(Direction.SOUTH) }
            "e" -> { move(east); map.updateLocation(Direction.EAST) }
            "w" -> { move(west); map.updateLocation(Direction.WEST) }
            else -> { move(end) }
        }
    }
}

class Location(val width : Int = 2, val height: Int = 2) {

    val map = Array(width) {
        arrayOfNulls<String>(height)
    }

    var currentLocation = Pair(0, 0)

    init {
        map[0][0] = "home"
        map[0][1] = "africa"
        map[1][0] = "artichoke"
        map[1][1] = "zimbabwe"
    }

    fun updateLocation(direction: Direction) {

        // if the user moves off the board, just continue on from the other side (infinite scroll)
        when (direction) {
            Direction.NORTH -> currentLocation = Pair(currentLocation.first, (currentLocation.second + 1).absoluteValue.rem(height))
            Direction.SOUTH -> currentLocation = Pair(currentLocation.first, (currentLocation.second - 1).absoluteValue.rem(height))
            Direction.EAST -> currentLocation = Pair((currentLocation.first + 1).absoluteValue.rem(height), currentLocation.second)
            Direction.WEST -> currentLocation = Pair((currentLocation.first - 1).absoluteValue.rem(height), currentLocation.second)
        }
    }

    fun getDescription(): String? {
        return map[currentLocation.first][currentLocation.second]
    }
}

fun main (args : Array<String>) {

    // simple lambdas
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)

    // get user input from the REPL console
    while (true) {
        println("What direction?\n")
        game.makeMove(readLine())
        println(game.map.getDescription())
    }
}


