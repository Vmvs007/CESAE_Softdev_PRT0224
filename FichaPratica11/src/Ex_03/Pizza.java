package Ex_03;

import Ex_03.Enums.TamanhoPizza;
import Ex_03.Ingredientes.*;

import java.util.ArrayList;

public class Pizza {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> listaIngredientes;
    private final int MAX_INGREDIENTES = 5;

    /**
     * Método construtor para <b>Pizza</b>
     * @param codigo Código inteiro para <b>Pizza</b>
     * @param nome Nome Comercial da <b>Pizza</b>
     * @param descricao Descrição Detalhada
     * @param preco Preço (€)
     * @param tamanho Tamanho [PEQUENA,MEDIA,GRANDE]
     */
    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIngredientes = new ArrayList<IngredientePizza>();
    }

    public void addIngredientePizza(Ingrediente ingredienteNovo, double quantidade) {

        // Avaliar se ainda cabem mais ingredientes
        if (this.listaIngredientes.size() < MAX_INGREDIENTES) {

            // Se ainda não tiver nenhum ingrediente
            if (this.listaIngredientes.isEmpty()) {

                if (ingredienteNovo instanceof Base) {
                    this.listaIngredientes.add(new IngredientePizza(ingredienteNovo, quantidade));
                }

            } else { // Se a pizza já tiver uma base

                if (ingredienteNovo instanceof Topping) {
                    this.listaIngredientes.add(new IngredientePizza(ingredienteNovo, quantidade));
                }
            }

        }
    }

    public void setQuantidadeIngrediente(int codigoIngrediente, double quantidadeNova) {

        // Iterar todos os IngredientePizza do Array
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {

            // Procurar o IngredientePizza que tenha o código pretendido
            if (ingredientePizzaAtual.getIngrediente().getCodigo() == codigoIngrediente) {

                // Altero a quantidade para a quantidadeNova
                ingredientePizzaAtual.setQuantidade(quantidadeNova);
            }
        }
    }

    public void removerIngredientePizza(int codigoIngrediente) {

        IngredientePizza ingredientePizzaRemover = null;

        // Iterar todos os IngredientePizza do Array
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {

            // Procurar o IngredientePizza que tenha o código pretendido
            if (ingredientePizzaAtual.getIngrediente().getCodigo() == codigoIngrediente) {
                ingredientePizzaRemover = ingredientePizzaAtual;
            }
        }

        // Se a lista de ingredientes só tiver 1 ingrediente (quer dizer que só tem base)
        if (this.listaIngredientes.size() == 1) {
            this.listaIngredientes.remove(ingredientePizzaRemover);
        } else {
            // Caso tenha mais do que 1 ingrediente, não deixamos remover caso não seja Topping
            if (ingredientePizzaRemover.getIngrediente() instanceof Topping) {
                this.listaIngredientes.remove(ingredientePizzaRemover);
            }
        }

    }

    /**
     * Método que calcula as calorias totais de uma <b>Pizza</b>
     * @return Kcal de todos os ingredientes juntos
     */
    public double calcularKcal() {

        double kcalTotaisPizza = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            double kcalUnidadeMedida = ingredientePizzaAtual.getIngrediente().getKcal();
            double kcalTotalIngrediente = kcalUnidadeMedida * ingredientePizzaAtual.getQuantidade();

            kcalTotaisPizza += kcalTotalIngrediente;
        }

        return kcalTotaisPizza;
    }

    private void exibirIngredientes() {
        int contador = 1;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            System.out.print("Ingrediente " + contador++ + ": ");
            ingredientePizzaAtual.exibirDetalhes();
            System.out.println();
        }
    }

    public String getTipoPizza(){

        String tipo= "";

        int contadorQueijo=0, contadorCarne=0, contadorFrutosMar=0, contadorVegetais=0;

        for(IngredientePizza ingredientePizzaAtual: this.listaIngredientes){

            if(ingredientePizzaAtual.getIngrediente() instanceof Queijo){
                contadorQueijo++;
            }

            if(ingredientePizzaAtual.getIngrediente() instanceof Carne){
                contadorCarne++;
            }

            if(ingredientePizzaAtual.getIngrediente() instanceof FrutoMar){
                contadorFrutosMar++;
            }

            if(ingredientePizzaAtual.getIngrediente() instanceof Vegetal){
                contadorVegetais++;
            }
        }

        if(contadorQueijo==0 && contadorCarne>0 && contadorFrutosMar==0 && contadorVegetais==0){
            tipo="Carne";
        }else if(contadorQueijo==0 && contadorCarne==0 && contadorFrutosMar>0 && contadorVegetais==0){
            tipo="Mar";
        }else if(contadorQueijo==0 && contadorCarne==0 && contadorFrutosMar==0 && contadorVegetais>0){
            tipo="Vegetariana";
        }else if(contadorQueijo>0 && contadorCarne>0 && contadorFrutosMar>0 && contadorVegetais>0){
            tipo="Completa";
        }else{
            tipo="Mista";
        }

        return tipo;
    }

    public void exibirDetalhesPizza() {
        System.out.println("***** " + this.nome + " ******");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanho);

        this.exibirIngredientes();

        System.out.println("Kcal Totais: "+this.calcularKcal() +" Kcal.");
        System.out.println("Tipo da Pizza: "+this.getTipoPizza());

    }
}
