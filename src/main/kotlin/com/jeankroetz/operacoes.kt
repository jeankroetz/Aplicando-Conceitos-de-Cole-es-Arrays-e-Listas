package com.jeankroetz

fun main() {
    val salarios = doubleArrayOf(4000.3,3456.4,2350.0,5680.0)

    for(salActual in salarios){
        println(salActual)
    }
    println("/////////////////")
    println("Maior salário: ${salarios.maxOf { it }}")
    println("Menor salário: ${salarios.minOf { it }}")
    println("Media dos salários: ${salarios.average()}")

    //Operação onde você aplica um filtro e trás somente os valores filtrados
    val salariosMaioresQue3500 = salarios.filter { it > 3500.0 }
    println(salariosMaioresQue3500)
}