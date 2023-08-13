class Imagem {

    private val figuras = mutableListOf<Figura>()

    fun adicionaFigura(f: Figura){
        this.figuras.add(f)
    }

    fun exibeFiguras(){

        println("Figuras:")

        for (figura in figuras) {
            println(figura)
        }
        println()
    }

    fun exibeSomaArea() {

        var soma = 0.0

        for (figura in figuras) {
            soma += figura.calculaArea()
        }
        println("A soma da area das figuras é: $soma")
        println()
    }

    fun exibeFiguraAreaMaior20(){

        println("Figuras com area maior que 20:")

        for (figura in figuras) {
            if (figura.calculaArea() > 20){
                println(figura)
            }
        }
        println()
    }

    fun exibeQuadrado() {

        println("Quadrados:")

        for (figura in figuras) {
            if(figura is Quadrado){
                println(figura)
            }
        }
        println()
    }

}