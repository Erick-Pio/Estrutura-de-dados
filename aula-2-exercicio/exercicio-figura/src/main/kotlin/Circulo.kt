class Circulo(
    cor:String,
    espessura:Int,
    var raio:Double
):Figura(cor,espessura) {

    override fun calculaArea(): Double {
        return 3.14 * (raio * raio)
    }

    override fun toString(): String {
        return "Area do circulo ${calculaArea()} (raio = $raio)"
    }

}