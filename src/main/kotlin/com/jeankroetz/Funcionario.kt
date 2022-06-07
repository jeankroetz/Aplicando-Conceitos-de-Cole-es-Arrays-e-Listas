package com.jeankroetz

class Funcionario (
    val nome: String,
    val salario: Double,
    val tipo: String)
{
    override fun toString(): String =
        """
            Nome:     $nome
            Salário:  $salario
            Tipo:     $tipo
            
        """.trimIndent()
}