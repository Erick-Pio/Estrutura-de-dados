package school.sptech.herancagregacao

class DesenvolvedorMobile(
    nome:String,
    var qtdHorasTrabalhadasMobile:Int,
    var valorHoraTrabalhadaMobile:Double
): Desenvolvedor(nome,
    qtdHorasTrabalhadasMobile,
    valorHoraTrabalhadaMobile
) {

    override fun getSalario():Double{
        return qtdHorasTrabalhadasMobile * valorHoraTrabalhadaMobile
    }

    override fun getSalarioMes():Double{
        return (qtdHorasTrabalhadasMobile * valorHoraTrabalhadaMobile) * 22
    }

    override fun toString(): String {
        return "DesenvolvedorMobile(" +
                "qtdHorasTrabalhadasMobile=$qtdHorasTrabalhadasMobile, " +
                "valorHoraTrabalhadaMobile=$valorHoraTrabalhadaMobile)" +
                "Salario por dia=${getSalario()}" +
                "Salario por mês=${getSalarioMes()}"
    }


}