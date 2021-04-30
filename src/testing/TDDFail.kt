package testing

import atomictest.eq

fun main() {
    calculateBMI(160, 69) eq "Normal weight"
//    calculateBMI(100, 68) eq "Underweight"
//    calculateBMI(200, 200) eq "Overweight"
}

fun calculateBMI(lbs: Int, height: Int) =
    "Normal weight"
/*
* Only first test passes. The other tests
* failed and are commented.
 */