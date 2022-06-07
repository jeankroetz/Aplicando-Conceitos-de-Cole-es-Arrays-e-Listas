package com.jeankroetz

fun main() {
    val pair: Pair<String, Double> = Pair("João", 3450.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

    println("///////////////////")

    val map2 = mapOf(
        "José" to 2690.0,
        "Rodrigo" to 3280.0,
        "Susan" to 3890
    )

    map2.forEach { (k,v) -> println("Chave: $k - Valor: $v") }
}