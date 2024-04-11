package Ex_07;

public class Main {
    public static void main(String[] args) {

        Livro asoiaf = new Livro("A Song of Ice and Fire","GRRM","Fantasia",500,"123456789");
        Livro headsFirstJava = new Livro("Heads First Java","X", "Programação",680,"987654321");

        asoiaf.exibirDetalhes();

        System.out.println();

        headsFirstJava.exibirDetalhes();
    }
}
