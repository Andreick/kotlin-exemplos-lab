package modelo

data class Usuario(
    val nome: String
) {
    private val formacoes = mutableListOf<Formacao>()

    fun inscrever(formacao: Formacao) : Boolean {
        if (formacoes.contains(formacao)) return false
        return formacoes.add(formacao)
    }

    fun getFormacoes() : List<Formacao> = formacoes
}
