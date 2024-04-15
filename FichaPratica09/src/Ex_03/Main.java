package Ex_03;

public class Main {
    public static void main(String[] args) {
        Animal dumbo = new Animal("Dumbo","Elefante","Africa do Sul",1000, new String[]{"Erva","Folhas","Fruta","Nozes"});

        String[] alimentacaoBobby = new String[4];
        alimentacaoBobby[0]="Bife";
        alimentacaoBobby[1]="Ossos";
        alimentacaoBobby[2]="Ração";
        alimentacaoBobby[3]="Biscoitos";


        Animal bobby = new Animal("Bobby","Cão","Portugal",28,alimentacaoBobby);

        dumbo.exibirDetalhes();

        dumbo.comer("Nozes",500);

        dumbo.exibirDetalhes();

        dumbo.comer("Batatas",1000);

        dumbo.exibirDetalhes();


    }
}
