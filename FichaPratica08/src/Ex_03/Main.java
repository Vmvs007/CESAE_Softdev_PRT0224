package Ex_03;

public class Main {

    public static void main(String[] args) {

        Retangulo terreno1 = new Retangulo(50,10);
        Retangulo terreno2 = new Retangulo(10,10);

        System.out.println("Área: "+terreno1.getArea());
        System.out.println("Perimetro: "+terreno1.getPerimetro());

        System.out.println();

        System.out.println("Área: "+terreno2.getArea());
        System.out.println("Perimetro: "+terreno2.getPerimetro());
    }
}
