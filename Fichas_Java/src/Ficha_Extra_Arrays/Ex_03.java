package Ficha_Extra_Arrays;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar array
        int[] vetor = new int[10];
        int valorPesquisado;

        // Ler o array
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Ler valor a pesquisar
        System.out.print("Valor a ser pesquisado: ");
        valorPesquisado = input.nextInt();

        // Pesquisar o valor no array
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisado) {
                encontrado = true;
            }
        }

        // Mostrar se foi encontrado ou não
        if (encontrado) {
            System.out.println("O valor " + valorPesquisado + " foi encontrado no array.");
        } else {
            System.out.println("O valor " + valorPesquisado + " não foi encontrado no array.");
        }

    }
}
