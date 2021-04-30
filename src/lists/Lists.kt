package lists

import atomictest.eq

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    // Select each element in the List:
    var result = ""
    for (i in ints) {
        result += "$1"
    }
    result eq "99 3 5 7 11 13"
    // Indexing into the list

    ints[4] eq 11
}