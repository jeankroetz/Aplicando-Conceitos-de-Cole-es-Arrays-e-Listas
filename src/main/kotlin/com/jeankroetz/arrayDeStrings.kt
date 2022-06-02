package com.jeankroetz

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Sérgio"
    nomes[2] = "Carlos"
    println("Nomes:")
    println("----------------")
    nomes.forEach {println(it)}// Quando só tem uma chamada, tudo bem usar o it
    nomes.sort()
    println("----------------")
    nomes.forEach {nomeAtual -> println(nomeAtual)}//Quando a aplicação fica mais complexa é melhor declarar cada it com seu proprio nome

    println("/////////////////")
    val alunos = arrayOf("Maria, Ricardo, Débora")
    println("Alunos:")
    println("----------------")
    alunos.forEach {println(it)}
    alunos.sort()
    println("----------------")
    alunos.forEach {alunoAtual -> println(alunoAtual)}

}