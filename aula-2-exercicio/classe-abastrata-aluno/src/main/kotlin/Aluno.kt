abstract class Aluno(var ra:Int, var nome:String, var nota1:Double, var nota2:Double) {

    abstract fun calcularMedia(): Double

    override fun toString(): String {
        return "Aluno(ra=$ra, nome='$nome')"
    }


}