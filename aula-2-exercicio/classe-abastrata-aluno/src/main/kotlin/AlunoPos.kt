class AlunoPos(
    ra:Int,
    nome:String,
    nota1:Double,
    nota2:Double,
    var notaMonografia: Double
): Aluno(ra, nome, nota1, nota2) {

    override fun calcularMedia(): Double {
        return (nota1 + nota2 + notaMonografia) / 3 
    }

}