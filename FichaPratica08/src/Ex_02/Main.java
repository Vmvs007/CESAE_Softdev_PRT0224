package Ex_02;

public class Main {
    public static void main(String[] args) {

        // Instanciar caes
        Cao cao1 = new Cao("Max", "Pastor Alemão");
        Cao cao2 = new Cao("Bobby", "Beagle");
        Cao cao3 = new Cao("Caramelo", "Vira-lata");

        // Ladram os 3
        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        // cao1 aprende a ladrar diferente
        cao1.setLatido("AUAUAU!!!");

        System.out.println();

        // Ladram os 3
        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        System.out.println();

        // Mensagem simpatica sobre o cao1
        System.out.println("O " + cao1.getNome() + " é " + cao1.getRaca() + " e é muito brincalhão!");

        System.out.println();

        // Apresentar se o ladrar dos caes é igual
        if (cao1.getLatido().equals(cao2.getLatido())) {
            System.out.println(cao1.getNome() + " ladra igual a " + cao2.getNome());
        }


    }
}
