package Ex_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double pesoAlimento) {

        boolean alimentoPermitido = false;

        // Iterar o array de alimentacao
        for (int i = 0; i < this.alimentacao.length && !alimentoPermitido; i++) {
            if (this.alimentacao[i].equals(alimento)) {
                alimentoPermitido = true;
            }
        }

        if (alimentoPermitido) {
            this.peso += pesoAlimento / 1000;
            System.out.println("O animal comeu");
        } else {
            System.out.println("O animal recusou a comida");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie:" + this.especie);
        System.out.println("Peso: " + this.peso + " Kg.");
        System.out.println();
    }
}
