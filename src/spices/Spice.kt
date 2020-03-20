package spices

// sealed class is very similar to abstract class, with the extract requirement that all subclasses are contained within this same file
// "interface delegation": the interface SpiceColor is implemented, and satisfied by the passed color of type SpiceColor
sealed class Spice(val name : String, spiciness: String, color : SpiceColor) : SpiceColor by color {
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
    val color : Color
}

// singleton object of SpiceColor
object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

data class SimpleContainer(var spice : Spice) {
    val label = spice.name
}

enum class Color(rbg : Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}
