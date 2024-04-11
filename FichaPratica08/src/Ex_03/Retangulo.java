package Ex_03;

public class Retangulo {

    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getArea() {
        return largura * altura;
    }

    public int getPerimetro() {
        return largura + largura + altura + altura;
    }
}
