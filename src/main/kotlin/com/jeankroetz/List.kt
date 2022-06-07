package com.jeankroetz

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 1200.0)
    val roberto = Funcionario("Roberto", 1150.0)

    val funcionarios = listOf(joao, maria, roberto)
    funcionarios.forEach{ println(it) }

    println("/////////////////")

    println(funcionarios.find { it.nome == "Maria" })

}

data class Funcionario(
    val nome: String,
    val salario: Double)
{
    override fun toString(): String =
        """
            Nome:     $nome
            Salário:  $salario
            
        """.trimIndent()
}

