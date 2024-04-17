package Ex_03.Ingredientes;

import Ex_03.Enums.BasePizza;
import Ex_03.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private BasePizza tipoBase;
    private String descricao;

    public Base(int codigo, String nome, double kcal, BasePizza tipoBase, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcal);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
