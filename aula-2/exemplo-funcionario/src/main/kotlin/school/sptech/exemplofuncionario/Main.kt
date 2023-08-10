package school.sptech.exemplofuncionario

fun main() {

    val f1 = Engenheiro("123456789", "João", 100.0)

    val f2 = Vendedor("123456789", "João", 40_000.0, 0.10)

    val f3 = Horista("123456789", "João Horista", 8 * 22, 5.0)

    println(f1)

    val empresa = Empresa()
    empresa.adicionaFunc(f1)
    empresa.adicionaFunc(f2)
    empresa.adicionaFunc(f3)

    empresa.exibeTodos()
    empresa.exibeHoristas()
    println(empresa.exibeTotalSalario())
}