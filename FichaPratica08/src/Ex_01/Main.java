package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("Vitor", 1.7, 24);
        Pessoa joana = new Pessoa("Joana", 1.55, 30);


        System.out.println(vitor.getNome());
        System.out.println(vitor.getAltura());
        System.out.println(vitor.getIdade());

        System.out.println();

        System.out.println(joana.getNome());
        System.out.println(joana.getAltura());
        System.out.println(joana.getIdade());



    }
}
