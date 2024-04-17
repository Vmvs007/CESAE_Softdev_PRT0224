package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemIngrediente;
import Ex_03.Enums.TipoQueijo;
import Ex_03.Enums.UnidadeMedida;

public class Queijo extends Topping{
    private TipoQueijo tipo;

    public Queijo(int codigo, String nome, UnidadeMedida unidadeMedidaIngrediente, double kcal, OrigemIngrediente origem, TipoQueijo tipo) {
        super(codigo, nome, unidadeMedidaIngrediente, kcal, origem);
        this.tipo = tipo;
    }
}
