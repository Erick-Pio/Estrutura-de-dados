fun main() {

    val f1 = AlunoFundamental(123456789, "João", 10.0, 5.3, 6.5, 7.0)

    val f2 = AlunoGraduacao(133433739, "João 1", 3.0, 5.0)

    val f3 = AlunoPos(665456789, "João 2", 8.0, 5.0, 9.0)

    val escola = Escola("sptech")

    val escola1 = Escola("Unicamp")

    escola.adicionaAluno(f1)
    escola.adicionaAluno(f2)
    escola.adicionaAluno(f3)

    escola.exibeTodos()
    escola.exibeAlunosGraduacao()
    escola.exibeAprovados()
    escola.buscaAluno(133433739)
}