package sptech.school.herancaprodutora

class Protagonista(
    nome:String,
    var qtdHorasTrabalhadasProtagonista:Int,
    var valorHoraTrabalhadaProtagonista:Double
): Ator(
    nome,
    qtdHorasTrabalhadasProtagonista,
    valorHoraTrabalhadaProtagonista
) {

    override fun getSalario(): Double {
        return qtdHorasTrabalhadasProtagonista * valorHoraTrabalhadaProtagonista
    }

    override fun getSalarioMes(): Double {
        return (qtdHorasTrabalhadasProtagonista * valorHoraTrabalhadaProtagonista) * 22
    }

    override fun toString(): String {
        return "Protagonista(qtdHorasTrabalhadasProtagonista = $qtdHorasTrabalhadasProtagonista, valorHoraTrabalhadaProtagonista = $valorHoraTrabalhadaProtagonista)" +
                "Salario por dia = ${getSalario()}, Salario por mẽs = ${getSalarioMes()}"
    }


}