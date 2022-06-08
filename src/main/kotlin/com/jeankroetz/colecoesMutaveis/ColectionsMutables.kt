package com.jeankroetz.colecoesMutaveis

import com.jeankroetz.Funcionario

fun main() {
    val joao = Funcionario("João", 3450.0, "PJ")
    val maria = Funcionario("Maria", 1200.0, "CLT")
    val roberto = Funcionario("Roberto", 1150.0, "PJ")

    //Listas mutaveis são iguais, porém podem ser mudadas posteriormente
    println("////////////  LIST  ///////////////")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("///////////////////////////")

    funcionarios.add(roberto)
    funcionarios.forEach { println(it) }

    println("///////////////////////////")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("////////////  SET  ///////////////")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("///////////////////////////")
    funcionariosSet.add(maria)
    funcionariosSet.add(roberto)
    funcionariosSet.forEach { println(it) }
}