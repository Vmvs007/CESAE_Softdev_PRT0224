package Ficha_05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        System.out.println("**************************");

        // Ler vetor 1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira um número no vetor1[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        System.out.println("**************************");

        // Ler vetor 2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira um número no vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        // Juntar os vetores numa matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            matriz[linha][0] = vetor1[linha];
            matriz[linha][1] = vetor2[linha];
        }

        System.out.println("************************************");

        // Imprimir a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("************************************");


    }
}
