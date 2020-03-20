package spices

// abstract class is a template, just like Java
// "interface delegation": the interface SpiceColor is implemented, and satisfied by the passed color of type SpiceColor
abstract class Spice(name : String, spiciness: String, color : SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

// subclass curry extends Spice and implements Grinder
// the passed color is set to a singleton object of type SpiceColor using "composition"
class Curry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor)
    : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color : String
}

// singleton object of SpiceColor
object YellowSpiceColor : SpiceColor {
    override val color: String = "yellow"
}