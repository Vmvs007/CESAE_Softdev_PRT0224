package Ex_03;

import Ex_03.Ingredientes.Ingrediente;

public class IngredientePizza {
    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        this.ingrediente.exibirDetalhes();
        System.out.print(" : " + this.quantidade + " ");

        switch (this.ingrediente.getUnidadeMedidaIngrediente()) {
            case GRAMAS:
                System.out.print("g.");
                break;
            case LITROS:
                System.out.print("L.");
                break;
            case UNIDADES:
                System.out.print("uni.");
                break;
        }
    }
}
