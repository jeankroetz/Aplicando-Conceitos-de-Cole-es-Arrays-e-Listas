package com.jeankroetz

fun main(){
    val salarios = arrayOf(
        "4000".toBigDecimal(),
        "3500".toBigDecimal(),
        "8200".toBigDecimal(),
        "7900".toBigDecimal()
    )

    println("///////////////////////////")
    println(salarios.somatoria())

    println("///////////////////////////")
    println(salarios.media())
}