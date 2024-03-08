package Ficha_05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        System.out.println("**************************");

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("**************************");


        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                // O vetor deixou de ser crescente
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("O vetor é crescente");
        } else {
            System.out.println("O vetor não é crescente");
        }


    }
}
