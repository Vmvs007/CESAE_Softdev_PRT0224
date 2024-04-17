package Ex_03.Ingredientes;

import Ex_03.Enums.UnidadeMedida;

public class Ingrediente {
    private int codigo;
    private String nome;
    private UnidadeMedida unidadeMedidaIngrediente;
    private double kcal;

    public Ingrediente(int codigo, String nome, UnidadeMedida unidadeMedidaIngrediente, double kcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedidaIngrediente = unidadeMedidaIngrediente;
        this.kcal = kcal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedidaIngrediente() {
        return unidadeMedidaIngrediente;
    }

    public double getKcal() {
        return kcal;
    }

    public void exibirDetalhes() {
        System.out.print("[ " + this.codigo + " | " + this.nome + " | " + this.unidadeMedidaIngrediente + " | " + this.kcal + " Kcal ]");
    }
}
