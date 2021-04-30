package constructors

class MutableNameAlien(var name: String)
class FixednamedAlien(val name: String)

fun main() {
    val alien1 =
        MutableNameAlien("Reserve Giraffe")
    val alien2 =
        FixednamedAlien("Krombopolis Micheal")
    alien1.name = "Parasite"
    println(alien1.name)
}