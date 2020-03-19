package spices

fun main(args : Array<String>) {

    val curry = Spice("curry", "mild")
    val paprika = Spice("paprika", "none")
    val salt = Spice("salt")

    val spices = listOf(curry, paprika, salt).filter {it.heat < 2}
    print(spices)

}

fun makeSalt() = Spice("salt")
