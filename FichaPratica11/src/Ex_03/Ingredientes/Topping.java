package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemIngrediente;
import Ex_03.Enums.UnidadeMedida;

public class Topping extends Ingrediente{
    private OrigemIngrediente origem;

    public Topping(int codigo, String nome, UnidadeMedida unidadeMedidaIngrediente, double kcal, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedidaIngrediente, kcal);
        this.origem = origem;
    }
}
