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
    val consultoria2 = Consultoria("Accenture", 1)

    val nomeDaVez = "Julia"

    val existeDesenvolvedor = consultoria0.existePorNome("Julia")

    if (existeDesenvolvedor){
        println("$nomeDaVez trabalha na ${consultoria0.nome}")
    } else {
        println("$nomeDaVez nao trabalha na ${consultoria0.nome}")
    }

//    println(dev0)
//    println(dev0.getSalario())
//
//    println(devMobile0)
//    println(devMobile0.getSalario())
}