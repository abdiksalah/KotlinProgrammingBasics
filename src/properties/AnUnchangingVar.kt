package properties

class Sofa() {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    sofa = Sofa()
    println(sofa.cover)
}