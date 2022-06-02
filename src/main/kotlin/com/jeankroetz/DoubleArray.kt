package com.jeankroetz

fun main() {
    val salario = DoubleArray(3)
    salario[0] = 3000.00
    salario[1] = 5000.00
    salario[2] = 2000.00

    println("Salários antes do aumento")
    println("----------------")
    salario.forEach { println(it) }

    println("/////////////////")

    //vai iterar ou alterar o valor no indice que está iterando no momento
    salario.forEachIndexed { index, valorSalario ->
        salario[index] = valorSalario * 1.2 } // Vai trazer o valor do salario do indice atual e aumentar 20%

    println("Salários depois do aumento de 20%")
    println("----------------")
    salario.forEach { println(it) }

    println("/////////////////")

    val bonus = doubleArrayOf(2000.00, 1200.00, 2400.00)

    println("Bonus anual")
    println("----------------")
    bonus.forEach { println(it) }

    println("/////////////////")

    // Vai calcular o salario aumentado em 20% + bonus
    // pegando o indice do salarioBonus e somando com o indice do bonus
    val salarioBonus: DoubleArray = salario //Aqui o salário já está com 20% de aumento

    salarioBonus.forEachIndexed { index, valorSalario ->
        salarioBonus[index] = valorSalario.plus(bonus[index])}

    println("Salário + Bonus anual")
    println("----------------")
    salarioBonus.forEach { println(it) }
}