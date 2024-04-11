package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar(int quantidade) {
        this.stock += quantidade;
    }

    public void vender(int quantidade) {
        if (this.stock >= quantidade) {
            this.stock -= quantidade;
        } else {
            System.out.println("Stock insuficiente");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Stock Atual: " + this.stock);
        System.out.println("");
    }

}
