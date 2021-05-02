package sets

import atomictest.eq

fun main() {
    val intSet = setOf(1, 2, 3, 9, 9, 4)
    // No duplicattes:
    intSet eq setOf(1, 2, 3, 4, 9)

    // Element order is unimportant
    setOf(1, 2) eq setOf(2, 1)

    // Set membership:
    (9 in intSet) eq true
    (99 in intSet) eq false

    intSet.contains(9) eq true
    intSet.contains(99) eq false

    // Does this set contain another set?
    intSet.union(setOf(3, 4, 5, 6)) eq
            setOf(1, 2, 3, 4, 5, 6, 9)

    // Set intersection:
    intSet intersect setOf(0, 1, 9, 10) eq
            setOf(2, 3, 4)
    intSet - setOf(0, 1, 9, 10) eq
            setOf(2, 3, 4)
}