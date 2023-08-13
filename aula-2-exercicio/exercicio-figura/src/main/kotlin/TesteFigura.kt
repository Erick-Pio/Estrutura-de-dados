fun main() {
    val q1 = Quadrado("Amarelo", 2, 10.0)

    val q2 = Quadrado("Vermelho", 3, 3.0)

    val r1 = Retangulo("Azul", 1, 8.0, 5.0)

    val t1 = Triangulo("Laranja", 3, 12.0, 5.3)

    val c1 = Circulo("Roxo", 5, 1.0)

    val imagem = Imagem()

    imagem.adicionaFigura(q1)
    imagem.adicionaFigura(q2)
    imagem.adicionaFigura(r1)
    imagem.adicionaFigura(t1)
    imagem.adicionaFigura(c1)

    imagem.exibeFiguras()
    imagem.exibeSomaArea()
    imagem.exibeFiguraAreaMaior20()
    imagem.exibeQuadrado()
}