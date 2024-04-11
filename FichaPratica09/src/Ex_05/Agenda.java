package Ex_05;

public class Agenda {
    private Pessoa[] pessoas;

    public Agenda() {
        this.pessoas = new Pessoa[20];
    }

    public void addPessoa(Pessoa pessoaNova) {

        // Perceber qual a ultima posição disponivel
        for (int i = 0; i < this.pessoas.length; i++) {
            if (pessoas[i] == null) {
                // Encontramos a primeira posição vazia
                pessoas[i] = pessoaNova;
                return;
            }
        }
    }


    public void imprimirAgenda() {

        System.out.println("***** Minha Agenda *****\n");
        for (int i = 0; i < this.pessoas.length; i++) {
            if (pessoas[i] != null) {
                // Imprimir as informações
                pessoas[i].exibirDetalhes();
                System.out.println("__________________________________________________");
            }
        }

    }
}
