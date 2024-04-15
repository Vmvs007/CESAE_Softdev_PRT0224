package Ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    public void exibirDetalhes() {
        System.out.println("________________________________________________________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Altura: " + this.altura + " m.");
        System.out.println("Peso: " + this.peso + " Kg.");
        System.out.println("Pais Origem: " + this.paisOrigem);
        System.out.println("________________________________________________________________");
    }
}
