package school.sptech.herancagregacao

class Consultoria(
    var nome:String,
    var vagas:Int
) {

    private val desenvolvedores = mutableListOf<Desenvolvedor>()

    fun existePorNome(nome: String): Boolean{
        return desenvolvedores.any { it.nome == nome }
    }

    fun contratar(desenvolvedor: Desenvolvedor) {
        if (desenvolvedores.size < vagas) {
            desenvolvedores.add(desenvolvedor)
            println("Desenvolvedor ${desenvolvedor.nome} contratado com sucesso")
        } else {
            println("Consultoria sem vagas disponíveis!")
        }

    }

    fun getQuantidadeDesenvolvedores(): Int{
        println("Desenvolvedores:")
        return desenvolvedores.size
    }

    fun getQuantidadeDesenvolvedoresMobile(): Int {
        println("Desenvolvedores Mobile:")

        return desenvolvedores.count { it is DesenvolvedorMobile }
    }

    fun getTotalSalarios(): Double {
        println("Soma dos salários dos desenvolvedores")
        return desenvolvedores.sumOf { it.getSalarioMes() }
    }

    fun buscarDesenvolvedorPorNome(nome: String): Desenvolvedor?{
        println("Buscando desenvolvedor pelo nome...")
        return desenvolvedores.find { it.nome == nome }
    }

    override fun toString(): String {
        return "Consultoria(nome='$nome', vagas=$vagas, desenvolvedores=$desenvolvedores)"
    }


}