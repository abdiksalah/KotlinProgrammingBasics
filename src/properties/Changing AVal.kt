package properties

class House {
    var sofa: String = ""
}

fun main() {
    val house = House()
    house.sofa = "Simple sleeping sofa: $89.00"
    println(house.sofa)
    house.sofa = "New leather sofa: $3,099.00"
    println(house.sofa)
}