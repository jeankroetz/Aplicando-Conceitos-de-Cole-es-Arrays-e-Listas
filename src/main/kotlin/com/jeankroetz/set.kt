package com.jeankroetz

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val maria = Funcionario("Maria", 1200.0, "CLT")
    val roberto = Funcionario("Roberto", 1150.0, "PJ")

    val funcionarios1 = setOf(joao, maria)
    val funcionarios2 = setOf(roberto)

    //Faz a união de dois conjuntos
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }
    println("/////////////////")


    val funcionarios3 = setOf(joao, maria, roberto)

    //Faz a subtração do conjunto b do conjunto a
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }
    println("/////////////////")


    //retorna apenas o que é comum entre os dois conjuntos
    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach { println(it) }
}