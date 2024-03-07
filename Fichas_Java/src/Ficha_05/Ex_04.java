package Ficha_05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor;

        System.out.println("**************************");

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("**************************");

        // Inicializar o menor
        menor = vetor[0];

        // Encontrar o menor elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Apresentar o menor elemento
        System.out.println("Menor: " + menor);

    }
}
