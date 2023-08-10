package school.sptech.exemplofuncionario

class Vendedor(
    cpf: String,
    nome: String,
    var vendas: Double,
    var taxas: Double
): Funcionario(cpf,nome) {
    override fun calcSalario(): Double {
        return vendas * taxas
    }

    override fun toString(): String {
        return "Vendedor(vendas=$vendas, taxas=$taxas ${super.toString()})"
    }

}