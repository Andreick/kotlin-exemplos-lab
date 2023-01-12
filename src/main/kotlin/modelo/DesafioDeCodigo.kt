package modelo

data class DesafioDeCodigo(
    override val nome: String,
    override val nivel: Nivel
) : Desafio()
