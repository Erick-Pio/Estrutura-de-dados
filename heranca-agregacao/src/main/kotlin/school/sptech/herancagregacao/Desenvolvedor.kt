package school.sptech.herancagregacao

open class Desenvolvedor(
    var nome:String,
    var qtdHorasTrabalhadas:Int,
    var valorHoraTrabalhada:Double
) {

    open fun getSalario():Double{
        return qtdHorasTrabalhadas * valorHoraTrabalhada
    }

    open fun getSalarioMes():Double{
        return (qtdHorasTrabalhadas * valorHoraTrabalhada) * 22
    }

    override fun toString(): String {
        return "Desenvolvedor(nome='$nome', qtdHorasTrabalhadas=$qtdHorasTrabalhadas, valorHoraTrabalhada=$valorHoraTrabalhada)" +
                "Salário por dia=${getSalario()}, salario por mês=${getSalarioMes()}"
    }


}