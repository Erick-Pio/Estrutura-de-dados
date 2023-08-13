class Quadrado(
    cor:String,
    espessura:Int,
    var lado:Double
):Figura(cor, espessura) {

    override fun calculaArea(): Double {
        return lado * lado
    }

    override fun toString(): String {
        return "Area do quadrado ${calculaArea()} (lado = $lado)"
    }

}