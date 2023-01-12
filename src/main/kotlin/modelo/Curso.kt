package modelo

data class Curso(
    override val nome: String,
    val nivel: Nivel = Nivel.BASICO,
    val duracaoHrs: Int = 1
) : Atividade()
