package lists

import atomictest.eq

// Return type is inferred:
fun inferred(p: Char, q: Char) =
    listOf(p, q)

// Explicity return typed:
fun explicit(p: Char, q: Char): List<Char> =
    listOf(p, q)

fun main() {
    inferred('a', 'b') eq "[a, b]"
    explicit('y', 'z') eq "[y, z]"
}