class AlunoFundamental(
    ra:Int,
    nome:String,
    nota1:Double,
    nota2:Double,
    var nota3: Double,
    var nota4: Double
): Aluno(ra, nome, nota1, nota2) {
    override fun calcularMedia(): Double {
        return (nota1 + nota2 + nota3 + nota4) / 4
    }

    override fun toString(): String {
        return "AlunoFundamental(nota3=$nota3, nota4=$nota4 ${super.toString()})"
    }


}