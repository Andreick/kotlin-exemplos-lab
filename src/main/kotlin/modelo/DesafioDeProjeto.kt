package modelo

data class DesafioDeProjeto(
    override val nome: String,
    override val nivel: Nivel,
    val duracaoHrs: Int
) : Desafio()
