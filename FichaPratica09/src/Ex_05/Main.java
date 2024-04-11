package Ex_05;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor",24,"vitor@gmail.com",910111222);
        Pessoa pessoa2 = new Pessoa("Joaquim",40,"quim@gmail.com",901888999);
        Pessoa pessoa3 = new Pessoa("Joana",20,"joana@gmail.com",900888777);

        Agenda minhaAgenda = new Agenda();

        minhaAgenda.addPessoa(pessoa1);
        minhaAgenda.addPessoa(pessoa2);
       // minhaAgenda.addPessoa(pessoa3);

        minhaAgenda.imprimirAgenda();

    }
}
