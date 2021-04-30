package creatingClasses

// Create some classes:
class Giraffe
class Bear
class Hippo

fun main() {
    // Create some objects:
    val g1 = Giraffe()
    val g2 = Giraffe()
    val b = Bear()
    val h = Hippo()

    // Each ojbect() is unique:
    println(g1)
    println(g2)
    println(b)
    println(h)

}

/* Sample output:
creatingClasses.Giraffe@74a14482
creatingClasses.Giraffe@1540e19d
creatingClasses.Bear@677327b6
creatingClasses.Hippo@14ae5a5

 */