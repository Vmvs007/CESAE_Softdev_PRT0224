package Ex_03;

import Ex_03.Enums.*;
import Ex_03.Ingredientes.*;


public class Main {
    public static void main(String[] args) {

        Base baseFinaItaliana = new Base(99,"Base Fina Italiana",3,BasePizza.FINA,"Muito italiana, muito boa");
        Base baseAlta = new Base(98,"Base Alta",5,BasePizza.ALTA,"Fantásticamente boa");

        Queijo queijoMozarella = new Queijo(10, "Queijo Mozarella", UnidadeMedida.GRAMAS, 2, OrigemIngrediente.IMPORTADO, TipoQueijo.MOZZARELA);

        Vegetal tomateCherry = new Vegetal(30, "Tomate Cherry", UnidadeMedida.UNIDADES, 8,OrigemIngrediente.NACIONAL, TipoVegetal.TOMATE);
        Vegetal azeitonas = new Vegetal(40, "Azeitona Preta", UnidadeMedida.UNIDADES, 3.5,OrigemIngrediente.NACIONAL,TipoVegetal.AZEITONAS);

        Carne fiambre = new Carne(33,"Fiambre Perna Extra",UnidadeMedida.UNIDADES,25,OrigemIngrediente.IMPORTADO,TipoCarne.FIAMBRE);

        Pizza pizza4EstacoesMedia = new Pizza(103, "4 Estações", "Fantástica", 12.5, TamanhoPizza.MEDIA);
        pizza4EstacoesMedia.addIngredientePizza(baseFinaItaliana,100);
        pizza4EstacoesMedia.addIngredientePizza(queijoMozarella, 150);
        pizza4EstacoesMedia.addIngredientePizza(tomateCherry, 6);
        pizza4EstacoesMedia.addIngredientePizza(azeitonas, 10);

        Pizza pizzaQueijoFiambrePequena = new Pizza(101, "Queijo e Fiambre", "Simples e Eficaz", 5, TamanhoPizza.PEQUENA);
        pizzaQueijoFiambrePequena.addIngredientePizza(baseAlta,90);
        pizzaQueijoFiambrePequena.addIngredientePizza(fiambre, 5);

        System.out.println("____________________________________________________\n");

        pizzaQueijoFiambrePequena.exibirDetalhesPizza();

        System.out.println("\n____________________________________________________\n");

        pizza4EstacoesMedia.exibirDetalhesPizza();


    }
}
