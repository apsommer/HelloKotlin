fun main(args: Array<String>) {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val eagerList = spices.filter {it.contains("curry")}.sorted()

    println(eagerList)

    val apples = spices.filter {it.startsWith('c') && it.endsWith('e')}
    println(apples)

    val bananas = spices.take(3).filter { it.startsWith('c') }
    println(bananas)
}


