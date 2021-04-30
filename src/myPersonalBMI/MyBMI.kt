package myPersonalBMI

import atomictest.eq
import testing3.calculateBMI

fun main() {
    calculateBMI(145.0, 63.6) eq "Normal weight"
    calculateBMI(135.0, 63.6) eq "Underweight"
    calculateBMI(150.0, 63.6) eq "Overwieght"


}

fun calculateMBI(
    lbs: Double,
    height: Double
): String {
    val bmi = lbs / (height * height) * 703.07
    return if (bmi < 18.5) "Underwieght"
    else if (bmi < 25) "Normal weight"
    else "Overwieght"
}