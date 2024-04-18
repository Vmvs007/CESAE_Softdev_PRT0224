package Ex_01;

public class Main {
    public static void main(String[] args) {

        Retangulo rt1 = new Retangulo("Preto",10,10);
        Retangulo rt2 = new Retangulo("Laranja",10,25);

        Circulo cr1 = new Circulo("Verde",10);
        Circulo cr2 = new Circulo("Azul",3);

        Triangulo tr1 = new Triangulo("Amarelo",10,5);
        Triangulo tr2 = new Triangulo("Branco",100,2);
        Triangulo tr3 = new Triangulo("Roxo",40,10);

        FiguraGeometrica[] listaFormas = new FiguraGeometrica[7];

        listaFormas[0]=rt1;
        listaFormas[1]=rt2;
        listaFormas[2]=cr1;
        listaFormas[3]=cr2;
        listaFormas[4]=tr1;
        listaFormas[5]=tr2;
        listaFormas[6]=tr3;

        System.out.println("____________________________________________");
        for(FiguraGeometrica figuraGeometricaAtual : listaFormas){
            figuraGeometricaAtual.mostrarCor();
            System.out.println("Perimetro: "+figuraGeometricaAtual.perimetro());
            System.out.println("Area: "+figuraGeometricaAtual.area());
            System.out.println("____________________________________________");
        }



    }
}
