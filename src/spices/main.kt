package spices

fun main(args : Array<String>) {

    val curry: Curry = Curry("curry", "hot")
    print(curry.color)

    val container = SimpleContainer(curry)
    print(container.label)

}
