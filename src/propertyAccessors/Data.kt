package propertyAccessors

import atomictest.eq

class Data(var i: Int)

fun main() {
    val data = Data(10)
    data.i eq 10 // Read the line 'i' property
    data.i = 20 // Write to the 'i' property
//    println(data.i)
}