package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemIngrediente;
import Ex_03.Enums.TipoFrutoMar;
import Ex_03.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    private TipoFrutoMar tipo;

    public FrutoMar(int codigo, String nome, UnidadeMedida unidadeMedidaIngrediente, double kcal, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(codigo, nome, unidadeMedidaIngrediente, kcal, origem);
        this.tipo = tipo;
    }
}
