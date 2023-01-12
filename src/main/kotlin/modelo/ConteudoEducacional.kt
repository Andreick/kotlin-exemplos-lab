package modelo

data class ConteudoEducacional(
    val nome: String,
    private val atividades: List<Atividade>
)
