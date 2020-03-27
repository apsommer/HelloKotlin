package directions

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game() {

    var path = mutableListOf<Direction>(Direction.START)

    val north = {path.add(Direction.NORTH)}
    val south = {path.add(Direction.SOUTH)}
    val east = {path.add(Direction.EAST)}
    val west = {path.add(Direction.END)}

    val end = {
        path.add(Direction.END)
        println("Game over.")
        println("Path: $path")
        path.clear()
        false
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

    // higher order functions (extension functions)
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val filteredNumbers = numbers.higherOrder {
        (it % 3) // pass this function as an input argument
    }
    println(filteredNumbers)
}

// extension function
fun List<Int>.higherOrder(block : (Int) -> Int) : List<Int> {

    val result = mutableListOf<Int>()
    var intOperatedOn = 0

    for (item in this) {

        // execute the function defined at the call site
        intOperatedOn = block(item)

        if (intOperatedOn == 0) {
            result.add(item)
        }
    }

    return result
}