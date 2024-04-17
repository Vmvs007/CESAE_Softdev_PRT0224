package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemIngrediente;
import Ex_03.Enums.TipoVegetal;
import Ex_03.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipo;

    public Vegetal(int codigo, String nome, UnidadeMedida unidadeMedidaIngrediente, double kcal, OrigemIngrediente origem, TipoVegetal tipo) {
        super(codigo, nome, unidadeMedidaIngrediente, kcal, origem);
        this.tipo = tipo;
    }
}
