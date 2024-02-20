package Ficha_01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Insira o valor1: ");
        valor1 = input.nextInt();

        // Ler valor2
        System.out.print("Insira o valor2: ");
        valor2 = input.nextInt();

        // Apresentar valor1
        System.out.println("\nValor1 inicial: " + valor1);

        // Apresentar valor2
        System.out.println("Valor2 inicial: " + valor2);

        // Trocar
        valor1=valor1+valor2;
        valor2= valor1-valor2;
        valor1=valor1-valor2;

        // Apresentar valor1
        System.out.println("\nValor1 trocado: " + valor1);

        // Apresentar valor2
        System.out.println("Valor2 trocado: " + valor2);
    }
}
