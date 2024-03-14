package Ficha_06;

import java.util.Scanner;

public class Ex_07 {

    public static void desenharQuadrado(int nLinhas, int nColunas, String caracter) {

        // Primeira Linha
        for (int i = 1; i <= nColunas; i++) {
            System.out.print(caracter);
        }

        System.out.println();


        // Linhas do Meio
        for (int m = 1; m <= nLinhas - 2; m++) {
            for (int i = 1; i <= nColunas; i++) {

                // Primeiro caracter
                if (i == 1) {
                    System.out.print(caracter);
                }

                // Espaços
                if (i != 1 && i != nColunas) {
                    System.out.print(" ");
                }

                // Ultimo caracter
                if (i == nColunas) {
                    System.out.print(caracter);
                }

            }
            System.out.println();
        }


        // Ultima linha
        for (int i = 1; i <= nColunas; i++) {
            System.out.print(caracter);
        }

    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int linhas, colunas;
        String caracter;

        // Ler linhas
        System.out.print("Insira as linhas: ");
        linhas = input.nextInt();

        // Ler colunas
        System.out.print("Insira as colunas: ");
        colunas = input.nextInt();

        // Ler caracter
        System.out.print("Insira um caracter: ");
        caracter = input.next();

        desenharQuadrado(linhas, colunas, caracter);

    }
}
