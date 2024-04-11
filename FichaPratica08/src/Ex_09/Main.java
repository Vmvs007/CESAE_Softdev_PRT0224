package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto caneta = new Produto("Caneta BIC Azul", 0.5);
        Produto bolacha = new Produto("Bolacha Maria", 1.2);

        caneta.exibirDetalhes();
        bolacha.exibirDetalhes();
        System.out.println("_____________________________________________");

        caneta.comprar(50);

        caneta.exibirDetalhes();
        bolacha.exibirDetalhes();
        System.out.println("_____________________________________________");

        bolacha.comprar(2);

        caneta.exibirDetalhes();
        bolacha.exibirDetalhes();
        System.out.println("_____________________________________________");

        caneta.vender(200);

        caneta.exibirDetalhes();
        bolacha.exibirDetalhes();
        System.out.println("_____________________________________________");

        caneta.vender(20);

        caneta.exibirDetalhes();
        bolacha.exibirDetalhes();
        System.out.println("_____________________________________________");

    }
}
