package Ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1= new Atleta("Cristiano Ronaldo","Futebol",1.85,80,"Portugal");
        Atleta atleta2 = new Atleta("Usain Bolt","Atletismo",1.95,90,"Colombia");
        Atleta atleta3 = new Atleta("Joana Silva","Natação",1.7,65,"Espanha");

        Competicao cortaMato = new Competicao("Corta Mato Anual do Porto","Portugal");
        cortaMato.addAtleta(atleta1);
        cortaMato.addAtleta(atleta2);
        cortaMato.addAtleta(atleta3);


        Competicao triatlo = new Competicao("Triatlo de Nova York","USA");
        triatlo.addAtleta(atleta2);

        cortaMato.exibirDetalhes();

        System.out.println();

        triatlo.exibirDetalhes();
    }
}
