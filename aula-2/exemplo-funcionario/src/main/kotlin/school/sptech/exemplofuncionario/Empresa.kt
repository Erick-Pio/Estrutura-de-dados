package school.sptech.exemplofuncionario

class Empresa {

    private val funcionarios = mutableListOf<Funcionario>()

    fun adicionaFunc(f: Funcionario) {
        this.funcionarios.add(f)
    }

    fun exibeTodos(){
        println("Todos os funcionários")
        for (funcionario in funcionarios) {
            println(funcionario)
        }

        println()
    }

    fun exibeTotalSalario(): Double{
        //var soma = 0.0

        return funcionarios.sumOf { it.calcSalario() }

//        for (funcionario in funcionarios) {
//            soma += funcionario.calcSalario()
//        }
//
//        println("\nA soma dos salários é : $soma")
    }

    fun exibeHoristas(){
        println("Funcionários horistas")

        for (funcionario in funcionarios) {
            if (funcionario is Horista)
                println(funcionario)
        }

        println()
    }



}