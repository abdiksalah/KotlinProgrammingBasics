package testing2

import atomictest.eq
import testing.calculateBMI

fun main() {
//    Everything fals:
    calculateBMI(160, 68) eq "Normal weight"
    calculateBMI(100, 68) eq "Underweight"
    calculateBMI(200, 68) eq "Overwieght"

}

fun calculateBMI(
    lbs: Int,
    height: Int
): String {
    val bmi = lbs / (height * height) * 703.07
    return if (bmi < 18.5) "Underwieght"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
// Now All of this test fails are commented and all fail.