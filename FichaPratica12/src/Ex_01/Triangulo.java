package Ex_01;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }

    @Override
    public double perimetro() {
        return 3*this.base;
    }
}
