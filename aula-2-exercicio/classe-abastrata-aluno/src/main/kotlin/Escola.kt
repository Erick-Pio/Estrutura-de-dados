class Escola(nome:String) {

    private val alunos = mutableListOf<Aluno>()

    fun adcicionaAluno(a: Aluno) {
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
        
    }

}