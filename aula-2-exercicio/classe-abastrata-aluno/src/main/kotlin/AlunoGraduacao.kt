class AlunoGraduacao(
    ra:Int,
    nome:String,
    nota1:Double,
    nota2:Double,
):Aluno(ra, nome, nota1, nota2) {

    override fun calcularMedia(): Double {
        return (nota1 * 0.4) + (nota2 * 0.6)
    }

}