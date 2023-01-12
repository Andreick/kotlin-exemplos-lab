package modelo

data class Formacao(
    val nome: String,
    private val conteudos: List<ConteudoEducacional>
) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}
