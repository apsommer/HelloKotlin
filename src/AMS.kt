import kotlin.random.Random

fun main(args: Array<String>) {

    // lambda
    val rollDice = {sides : Int -> if (sides == 0) 0 else Random.nextInt(1, sides + 1)} // (from, until]
    println(rollDice(12))

    // lambda function type notation
    val rollDice1 : (Int) -> Int = {sides -> if (sides == 0) 0 else Random.nextInt(1, sides + 1)}
    println(rollDice1(6))

    // function type notation is more readable, which reduces errors, clearly showing the what type is passed in and what type is returned.
    gamePlay(rollDice1(6))
}

fun gamePlay(rollEm : Int) {
    print(rollEm)
}
