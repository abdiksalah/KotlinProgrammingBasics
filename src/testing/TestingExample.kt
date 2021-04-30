package testing

import atomictest.eq

import atomictest.neq

fun main() {
    val v1 = 11
    val v2 = "Ontology"
    // 'eq' means "equals":
    v1 eq 11
    v2 eq "Ontolgy"

    // 'neq' "not equal"
    v2 neq "Epistimoology"

}