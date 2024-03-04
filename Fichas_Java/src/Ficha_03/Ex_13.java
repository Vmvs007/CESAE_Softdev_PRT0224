package Ficha_03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler inicio
        System.out.print("Insira o inicio: ");
        inicio = input.nextInt();

        // Ler fim
        System.out.print("Insira o limite: ");
        fim = input.nextInt();

        while (inicio <= fim) {

            if (inicio % 5 == 0) {
                System.out.println(inicio);
            }

            inicio++;
        }

    }
}
