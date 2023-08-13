class Triangulo(
    cor:String,
    espessura:Int,
    var base:Double,
    var altura:Double
):Figura(cor, espessura) {
    override fun calculaArea(): Double {
        return (base * altura) / 2
    }

    override fun toString(): String {
        return "Area do triangulo = ${calculaArea()}  (base = $base, altura = $altura)"
    }


}