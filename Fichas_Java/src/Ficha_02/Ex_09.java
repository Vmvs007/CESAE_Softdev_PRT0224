package Ficha_02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, num3;

        // Ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        // Ler num3
        System.out.print("Insira um número: ");
        num3 = input.nextInt();

        // Apresentar o menor
        if (num1 < num2 && num1 < num3) { // Menor: num1
            System.out.println("Menor: " + num1);
        }

        if (num2 < num1 && num2 < num3) { // Menor: num2
            System.out.println("Menor: " + num2);
        }

        if (num3 < num1 && num3 < num2) { // Menor: num3
            System.out.println("Menor: " + num3);
        }

    }
}
