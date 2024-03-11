package Ficha_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int maior, menor, posAtual;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira número na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
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

        maior = matriz[0][0];
        menor = matriz[0][0];

        // Encontrar o maior e o menor
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                posAtual = matriz[linha][coluna];

                if (posAtual > maior) {
                    maior = posAtual;
                }

                if (posAtual < menor) {
                    menor = posAtual;
                }

            }
        }


        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);


    }
}
