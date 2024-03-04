package Ficha_03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler inicio
        System.out.print("Insira o ínicio do intervalo: ");
        inicio = input.nextInt();

        // Ler fim
        System.out.print("Insira o fim do intervalo: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio + 1;
        }


    }
}
