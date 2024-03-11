package Ficha_05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int somatorio = 0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira número na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.println("************************************");

        // Somar diagonal principal
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (linha == coluna) {
                    somatorio = somatorio + matriz[linha][coluna];
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            somatorio = somatorio + matriz[i][i];
        }

        System.out.println("Somatorio: " + somatorio);


    }
}
