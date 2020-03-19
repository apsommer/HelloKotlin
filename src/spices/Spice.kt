package spices

class Spice (val name : String, val spiciness : String = "mild") {

    val heat : Int
        get() {
            return when (spiciness) {
                "none" -> 0
                "mild" -> 4
                "hot" -> 9
                else -> 2
            }
        }

    init {
        print("name: $name spiciness: $spiciness \n")
    }
}