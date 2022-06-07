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

    println("/////////////////")
    //Operação onde você aplica um filtro e trás somente os valores filtrados
    val salariosMaioresQue3500 = salarios.filter { it > 3500.0 }
    println(salariosMaioresQue3500)

    println("/////////////////")
    //operação que conta quantos elementos tem do valor especificado
    // ou quantos valores tem entre o range especificado
    println(salarios.count { it in 2000.0..3500.0 })

    println("/////////////////")
    //operação que procura exatamente o valor especificado, caso não exista retorna null
    println(salarios.find { it == 5680.0 })

    println("/////////////////")
    // procura dentro da coleção qualquer valor que torne a operação verdadeira
    // -Encontrou algo que torne nossa expressão verdadeira? retorna booleano
    println(salarios.any { it == 2000.0 })
}