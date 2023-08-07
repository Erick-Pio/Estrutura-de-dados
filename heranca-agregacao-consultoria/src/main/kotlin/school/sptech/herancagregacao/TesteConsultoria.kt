package school.sptech.herancagregacao

fun main() {

    val dev0 = Desenvolvedor(
        "Leonardo", 8 , 20.0
    )
    val dev1 = Desenvolvedor(
        "Marcelo", 8 , 15.0
    )
    val dev2 = Desenvolvedor(
        "Rafael", 5 , 13.5
    )

    val devMobile0 = DesenvolvedorMobile(
        "Julia", 8, 25.0
    )
    val devMobile1 = DesenvolvedorMobile(
        "Carol", 6, 15.0
    )
    val devMobile2 = DesenvolvedorMobile(
        "Alena", 8, 25.0
    )

    val consultoria0 = Consultoria("sptech", 10)
    val consultoria1 = Consultoria("Stefanini", 0)
    val consultoria2 = Consultoria("Accenture", 2)

    val nomeDaVez = "Julia"

    val existeDesenvolvedor = consultoria0.existePorNome("Julia")

    if (existeDesenvolvedor){
        println("$nomeDaVez trabalha na ${consultoria0.nome}")
    } else {
        println("$nomeDaVez nao trabalha na ${consultoria0.nome}")
    }

     consultoria2.contratar(dev0)
     consultoria2.contratar(devMobile0)
     consultoria2.contratar(dev1)

    val nomeDaVez1 = "Leonardo"

    val existeDesenvolvedor1 = consultoria2.existePorNome("Leonardo")
    if (existeDesenvolvedor1){
        println("$nomeDaVez1 trabalha na ${consultoria2.nome}")
    } else {
        println("$nomeDaVez1 nao trabalha na ${consultoria2.nome}")
    }

    println(consultoria2.getQuantidadeDesenvolvedores())
    println(consultoria2.getQuantidadeDesenvolvedoresMobile())
    println(consultoria2.getTotalSalarios())

    val nomePessoa = "Julia"
    val procurarFuncionário = consultoria2.buscarDesenvolvedorPorNome(nomePessoa)

    if (procurarFuncionário != null){
        println("Desenvolverdor ${procurarFuncionário.nome} encontrado")
    } else {
        println("Desenvolvedor $nomePessoa não encontrado")
    }

    val nomePessoa1 = "Ricardo"
    val procurarFuncionário1 = consultoria2.buscarDesenvolvedorPorNome(nomePessoa1)

    if (procurarFuncionário1 != null){
        println("Desenvolverdor ${procurarFuncionário1.nome} encontrado")
    } else {
        println("Desenvolvedor $nomePessoa1 não encontrado")
    }


//    println(dev0)
//    println(dev0.getSalario())
//
//    println(devMobile0)
//    println(devMobile0.getSalario())
}