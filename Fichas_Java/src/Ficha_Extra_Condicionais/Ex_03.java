package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Declarar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double precoProduto;

        // Ler preco
        System.out.print("Insira o preco: ");
        precoProduto = input.nextDouble();

        // Perceber se preço é maior que 100
        if (precoProduto > 100) {
            // Aplicar desconto
            precoProduto = precoProduto * 0.9;
        }

        System.out.println("Preço Final: " + precoProduto);


    }
}
