package Ficha_01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco1, preco2, preco3, precoTotal;

        // Ler preco1
        System.out.print("Insira o preco1: ");
        preco1 = input.nextDouble();

        // Ler preco2
        System.out.print("Insira o preco2: ");
        preco2 = input.nextDouble();

        // Ler preco3
        System.out.print("Insira o preco3: ");
        preco3 = input.nextDouble();

        // Calcular desconto
        precoTotal = (preco1 + preco2 + preco3) * 0.9;

        // Apresentar o preco final
        System.out.println("Preço Final c/ 10 porcento Desconto: " + precoTotal + " €");

    }
}
