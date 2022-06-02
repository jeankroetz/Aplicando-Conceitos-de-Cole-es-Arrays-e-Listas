package com.jeankroetz

fun main() {
    val values = IntArray(5)
    values[0] = 2
    values[1] = 34
    values[2] = 26
    values[3] = 12
    values[4] = 75

    for (valor in values){
        println(valor)
    }
    print("|||||||||||||||||||||||")
    values.forEach {valor ->
        println(valor)
    }
    print("|||||||||||||||||||||||")
    for(index in values.indices){
        println(values[index])
    }
    print("||||||||||||||||||||||||")
    values.sort()
    for (valor in values){
        println(valor)
    }
}