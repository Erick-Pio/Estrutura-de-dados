package school.sptech.exemplofuncionario

abstract class Funcionario(
    var cpf:String,
    var nome:String
) {

    abstract fun calcSalario(): Double

    //alt + insert
    override fun toString(): String {
        return "Funcionario(cpf='$cpf', nome='$nome', salario=${calcSalario()})"
    }

}