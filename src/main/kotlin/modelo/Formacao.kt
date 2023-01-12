package modelo

data class Formacao(
    val nome: String,
    private val conteudos: List<ConteudoEducacional>
) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!usuario.inscrever(this)) return
        inscritos.add(usuario)
    }

    fun getUsuariosInscritos() : List<Usuario> = inscritos
}
