class Escola(nome:String) {

    private val alunos = mutableListOf<Aluno>()

    fun adicionaAluno(a: Aluno) {
        this.alunos.add(a)
    }

    fun exibeTodos(){
        println("Todos os alunos")
        for (aluno in alunos) {
            println(aluno)
        }

        println()
    }

    fun exibeAlunosGraduacao() {
        println("Alunos Graduação: ")

        for (aluno in alunos) {
            if (aluno is AlunoGraduacao)
                println(aluno)
        }
    }

    fun exibeAprovados(){
        println("Alunos Aprovados: ")

        for (aluno in alunos) {
            if (aluno.calcularMedia() >= 6){
                println(aluno)
            }
        }
    }

    fun buscaAluno(ra: Int): Unit {

        println("Digite o RA do aluno: ")

        val alunoProcurado = alunos.find { it.ra == ra }

        if (alunoProcurado != null) {
            println("Aluno ${alunoProcurado.nome} encontrado")
        } else {
            println("Aluno não encontrado")
        }
    }

}