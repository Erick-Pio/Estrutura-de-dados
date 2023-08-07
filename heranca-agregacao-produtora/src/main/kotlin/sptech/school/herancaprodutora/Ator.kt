package sptech.school.herancaprodutora

open class Ator(
    var nome:String,
    var qtdHorasTrabalhadas:Int,
    var valorHorasTrabalhada:Double
) {

    open fun getSalario(): Double{
        return qtdHorasTrabalhadas + valorHorasTrabalhada
    }

    open fun getSalarioMes():Double{
        return (qtdHorasTrabalhadas * valorHorasTrabalhada) * 22
    }

    override fun toString(): String {
        return "Ator(nome='$nome', qtdHorasTrabalhadas=$qtdHorasTrabalhadas, valorHorasTrabalhada=$valorHorasTrabalhada)" +
                "Salario por dia=${getSalario()}, Salario por mês=${getSalarioMes()}"
    }


}