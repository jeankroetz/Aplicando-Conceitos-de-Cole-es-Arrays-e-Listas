package com.jeankroetz

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val maria = Funcionario("Maria", 1200.0,"CLT")
    val roberto = Funcionario("Roberto", 1150.0,"PJ")

    val funcionarios = listOf(joao, maria, roberto)
    funcionarios.forEach{ println(it) }

    println("/////////////////")

    println(funcionarios.find { it.nome == "Maria" })

    println("/////////////////")
    //Operação de ordenação por propriedades de um objeto
    //Encadeamento
    //O forEach atua como coletor, pegando os valores gerados pelo sortedBy e imprimindo
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("/////////////////")
    //Agrupa por propriedade
    funcionarios.groupBy { it.tipo }.forEach { println(it) }
}

