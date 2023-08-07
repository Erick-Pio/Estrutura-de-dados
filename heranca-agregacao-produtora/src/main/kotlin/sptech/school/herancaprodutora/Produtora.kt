package sptech.school.herancaprodutora

class Produtora (
    var nome:String,
    var vagas: Int
) {
    private val atores = mutableListOf<Ator>()

    fun existePorNome(nome: String): Boolean {
        return atores.any { it.nome == nome }
    }

    fun contratar(ator: Ator) {
        if (atores.size < vagas){
            atores.add(ator)
            println("Ator ${ator.nome} contratado com sucesso!!!")
        } else {
            println("Produtora sem vagas disponíveis")
        }
    }

    fun getQuantidadeAtores(): Int {
        println("Número de atores:")
        return atores.size
    }

    fun getQuantidadeProtagonistas(): Int {
        println("Número de protagonistas")

        return atores.count { it is Protagonista }
    }

    fun getTotalSalarios(): Double {
        println("Soma dos salários dos atores")
        return atores.sumOf { it.getSalarioMes() }
    }

    fun buscarAtorPorNome(nome: String): Ator?{
        println("Buscando ator pelo nome...")
        return atores.find { it.nome == nome }
    }

    override fun toString(): String {
        return "Produtora(nome='$nome', vagas=$vagas, atores=$atores)"
    }


}