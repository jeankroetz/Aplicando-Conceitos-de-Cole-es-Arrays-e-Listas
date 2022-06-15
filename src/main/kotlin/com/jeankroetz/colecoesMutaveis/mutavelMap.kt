package com.jeankroetz.colecoesMutaveis

import com.jeankroetz.Funcionario

fun main() {
    val fun1 = Funcionario("João", 1000.0, "CLT")
    val fun2 = Funcionario("Maria", 1200.0, "CLT")
    val fun3 = Funcionario("Roberto", 1150.0, "PJ")

    val repositorio = Repository<Funcionario>()

    repositorio.create(fun1.nome, fun1)
    repositorio.create(fun2.nome, fun2)
    repositorio.create(fun3.nome, fun3)

    println(repositorio.findById(fun1.nome))

    println("///////////////////////////")

    println("Removido do map")

    println(repositorio.remove(fun2.nome))

    println("///////////////////////////")

    repositorio.findAll().forEach { println(it) }
}