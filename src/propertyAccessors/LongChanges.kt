package propertyAccessors

import atomictest.eq
import atomictest.trace

class LongChanges {
    var n: Int = 0
        set(value) {
            trace("$field becomes $value")
            field = value
        }
}

fun main() {
    val lc = LongChanges()
    lc.n eq 0
    lc.n = 2
    lc.n eq 2
    trace eq "0 becomes 2"
}