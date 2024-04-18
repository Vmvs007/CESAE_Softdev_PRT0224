package Ex_01;

public class Retangulo extends FiguraGeometrica{
    private double comprimento;
    private double altura;

    public Retangulo(String cor, double comprimento, double altura) {
        super(cor);
        this.comprimento = comprimento;
        this.altura = altura;
    }


    @Override
    public double area() {
        return this.comprimento*this.altura;
    }

    @Override
    public double perimetro() {
        return this.comprimento+this.comprimento+this.altura+this.altura;
    }
}
