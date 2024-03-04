package Ficha_03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num = 0, media, somatorio = 0, contador = 0;

        while (num != -1) {

            System.out.print("Insira um número: ");
            num = input.nextDouble();

            contador++; // contador = contador + 1;
            somatorio = somatorio + num;

            // System.out.println("\nContador: "+contador);
            // System.out.println("Somatorio: "+somatorio);
        }

        media = (somatorio + 1) / (contador - 1);
        System.out.println("Média: " + media);

    }
}
