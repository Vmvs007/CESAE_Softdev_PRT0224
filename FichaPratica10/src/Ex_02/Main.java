package Ex_02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor S.",24,"911222333","vitor@gmail.com");
        Pessoa pessoa2 = new Pessoa("Joaquim", 30,"913444555","quim@gmail.com");
        Pessoa pessoa3 = new Pessoa("Joana",15,"928999000","joana@gmail.com");
        Pessoa pessoa4 = new Pessoa("Tatiana",29,"950333444","tatiana@gmail.com");

        Sorteio euromilhoes = new Sorteio(150000000);
        euromilhoes.addParticipante(pessoa1);
        euromilhoes.addParticipante(pessoa2);
        euromilhoes.addParticipante(pessoa3);
        euromilhoes.addParticipante(pessoa4);

        System.out.println();
        euromilhoes.imprimirParticipantes();

        System.out.println();
        System.out.println("**** Grande Vencedor do Prémio de "+ euromilhoes.getPremio() +" €");
        Pessoa vencedor = euromilhoes.fazerSorteio();
        vencedor.exibirDetalhes();
    }
}
