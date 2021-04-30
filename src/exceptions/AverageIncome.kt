package exceptions
// Suppose we calculate average income over a period of months:
import atomictest.capture
import atomictest.eq

fun averageIncome(income: Int, months: Int) =
    income / months

fun main() {
    averageIncome(3300, 3) eq 1100
    capture {
        averageIncome(5000, 0)

    } eq "ArithmeticException: / by zero"
}