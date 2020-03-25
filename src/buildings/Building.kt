package buildings

open class BaseBuildingMaterial (val numberNeeded : Int = 1) {


}

class Wood (numberNeeded: Int = 4) : BaseBuildingMaterial (numberNeeded) {

}

class Brick (numberNeeded: Int = 8) : BaseBuildingMaterial (numberNeeded) {


}

open class Building<T : BaseBuildingMaterial> (val material : T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        val name : String? = material::class.simpleName
        println("Type of materials needed: $name and number needed is: ${this.actualMaterialsNeeded}")
    }
}