package Ficha_05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        double total = 0, media;

        System.out.println("**************************");

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        // Encontrar o somatorio
        for (int i = 0; i < vetor.length; i++) {
            total = total + vetor[i];
        }

        // Calcular a media
        media = total / vetor.length;

        // Apresentar a media
        System.out.println("Média: " + media);

    }
}
