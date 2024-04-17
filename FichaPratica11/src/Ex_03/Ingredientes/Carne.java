package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemIngrediente;
import Ex_03.Enums.TipoCarne;
import Ex_03.Enums.UnidadeMedida;

public class Carne extends Topping{
    private TipoCarne tipo;

    public Carne(int codigo, String nome, UnidadeMedida unidadeMedidaIngrediente, double kcal, OrigemIngrediente origem, TipoCarne tipo) {
        super(codigo, nome, unidadeMedidaIngrediente, kcal, origem);
        this.tipo = tipo;
    }
}
