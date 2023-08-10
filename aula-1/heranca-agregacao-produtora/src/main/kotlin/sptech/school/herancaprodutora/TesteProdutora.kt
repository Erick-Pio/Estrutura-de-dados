package sptech.school.herancaprodutora

fun main() {
    val ator0 = Ator (
        "Leonardo", 8 , 20.0
    )
    val ator1 = Ator(
        "Marcelo", 8 , 15.0
    )
    val ator2 = Ator(
        "Rafael", 5 , 13.5
    )

    val protagonista0 = Protagonista(
        "Julia", 8, 25.0
    )
    val protagonista1 = Protagonista(
        "Carol", 6, 15.0
    )
    val protagonista2 = Protagonista(
        "Alena", 8, 25.0
    )

    val produtora0 = Produtora("A24", 10)
    val produtora1 = Produtora("Warner Bros", 0)
    val produtora2 = Produtora("Universal", 2)

    val nomeDaVez = "Julia"

    val existeAtor = produtora0.existePorNome(nomeDaVez)

    if (existeAtor){
        println("$nomeDaVez trabalha na ${produtora0.nome}")
    } else {
        println("$nomeDaVez nao trabalha na ${produtora0.nome}")
    }

    produtora0.contratar(ator0)
    produtora0.contratar(protagonista2)
    produtora0.contratar(ator1)

    val nomeDaVez1 = "Alena"

    val existeDesenvolvedor1 = produtora0.existePorNome(nomeDaVez)
    if (existeDesenvolvedor1){
        println("$nomeDaVez1 trabalha na ${produtora0.nome}")
    } else {
        println("$nomeDaVez1 nao trabalha na ${produtora0.nome}")
    }

    println(produtora0.getQuantidadeAtores())
    println(produtora0.getQuantidadeProtagonistas())
    println(produtora0.getTotalSalarios())

    val nomePessoa = "Alena"
    val procurarAtor = produtora0.buscarAtorPorNome(nomePessoa)

    if (procurarAtor != null){
        println("Desenvolverdor ${procurarAtor.nome} encontrado")
    } else {
        println("Desenvolvedor $nomePessoa não encontrado")
    }

    val nomePessoa1 = "Ricardo"
    val procurarAtor1 = produtora0.buscarAtorPorNome(nomePessoa1)

    if (procurarAtor1 != null){
        println("Desenvolverdor ${procurarAtor1.nome} encontrado")
    } else {
        println("Desenvolvedor $nomePessoa1 não encontrado")
    }

}