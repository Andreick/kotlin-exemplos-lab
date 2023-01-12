import modelo.*

fun main() {
    val formacaoKolin = gerarFomacaoKotlin()
    val usuario1 = Usuario("Wiudo")
    val usuario2 = Usuario("Peawo")

    formacaoKolin.apply {
        matricular(usuario1)
        matricular(usuario2)
    }

    println(formacaoKolin.getUsuariosInscritos())
    println(usuario1.getFormacoes())
    println(usuario2.getFormacoes())
}

fun gerarFomacaoKotlin() : Formacao {
    return Formacao(
        "Kotlin Experience", listOf(
            ConteudoEducacional(
                "Dominando a Linguagem de Programação Kotlin ", listOf(
                    Curso("Conhecendo o Kotlin e Sua Documentação Oficial", Nivel.BASICO, 1),
                    DesafioDeProjeto(
                        "Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin",
                        Nivel.BASICO,
                        2
                    )
                )
            ),
            ConteudoEducacional(
                "Refinando Sua Técnica Com Desafios de Código em Kotlin", listOf(
                    DesafioDeCodigo("Explorando Mapas, Loops e Regras com Kotlin", Nivel.INTERMEDIARIO),
                    DesafioDeCodigo("Utilizando a Keywokrd Object com Orientação a Objetos (OO)", Nivel.DIFICIL)
                )
            )
        )
    )
}
