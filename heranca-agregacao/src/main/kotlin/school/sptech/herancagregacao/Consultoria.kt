package school.sptech.herancagregacao

class Consultoria(
    var nome:String,
    var vagas:Int
) {

    private val desenvolvedoress = mutableListOf<Desenvolvedor>()

    fun existePorNome()

}