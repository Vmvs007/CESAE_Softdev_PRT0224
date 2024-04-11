package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta conta123 = new Conta("123", "Vitor");
        Conta conta99 = new Conta("99", "Primo da Suiça");
        Conta conta11 = new Conta("11", "Joaquim");

        // Contas começam todas a 0
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();

        // Conta 123 deposita 100€
        conta123.depositar(100);
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();

        // Conta 123 tenta levantar 400€
        conta123.levantar(400);
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();

        // Conta123 levanta 10
        conta123.levantar(10);
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();

        // Conta 123 transfere 50€ para conta 99
        conta123.transferir(50, conta99);
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();

        // Conta 99 deposita 10000€
        conta99.depositar(10000);
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();

        // Conta 99 transfere 9900€ para conta 11
        conta99.transferir(9900, conta11);
        conta123.exibirDetalhes();
        conta99.exibirDetalhes();
        conta11.exibirDetalhes();
        System.out.println();
    }
}
