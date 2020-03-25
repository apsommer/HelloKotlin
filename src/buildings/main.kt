package buildings

fun main (args : Array<String>) {

    val building = Building(Wood())
    building.build()
    isSmallBuilding(building)
}