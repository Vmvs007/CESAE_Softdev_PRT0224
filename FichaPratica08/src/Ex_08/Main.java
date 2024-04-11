package Ex_08;

public class Main {
    public static void main(String[] args) {

        Aluno vitor = new Aluno("Vitor S.", 24, "Informática", 20);
        Aluno joaquim = new Aluno("Quim", 33, "Culinária", 5.5);

        System.out.println("Situação do Vitor: " + vitor.situacao());

        System.out.println("Situação do Joaquim: " + joaquim.situacao());
    }
}
