package school.sptech.herancagregacao

fun main() {

    val dev0 = Desenvolvedor(
        "Leonardo", 8 , 20.0
    )

    val devMobile0 = DesenvolvedorMobile(
        "Julia", 8, 25.0
    )

    println(dev0)
    println(dev0.getSalario())

    println(devMobile0)
    println(devMobile0.getSalario())
}