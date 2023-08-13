class Retangulo(
    cor:String,
    espessura:Int,
    var base:Double,
    var altura:Double
):Figura(cor, espessura) {

    override fun calculaArea(): Double {
        return base * altura
    }

    override fun toString(): String {
        return "Area do Retangulo = ${calculaArea()}  (base = $base, altura = $altura)"
    }


}