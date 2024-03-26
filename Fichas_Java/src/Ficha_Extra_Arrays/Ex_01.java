package Ficha_Extra_Arrays;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[12];

        System.out.println("**************************");

        // Ler vetor (vetor.lenght permite obter o tamanho do vetor)
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("**************************");

        // Imprimir o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }
    }
}
