package Ficha_05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int numPesquisa, contador = 0;

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

        // Perguntar ao utilizador o numero a pesquisar
        System.out.print("Insira um número a pesquisar: ");
        numPesquisa = input.nextInt();

        // Contar quantas vezes o numero aparece na matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] == numPesquisa) {
                    contador++;
                }

            }
        }

        System.out.println("Há " + contador + " posições na matriz com o número " + numPesquisa);


    }
}
