package school.sptech.herancagregacao

class Consultoria(
    var nome:String,
    var vagas:Int
) {

    private val desenvolvedores = mutableListOf<Desenvolvedor>()

    fun existePorNome(nome: String): Boolean{
        return desenvolvedores.any { it.nome == nome }
    }



}