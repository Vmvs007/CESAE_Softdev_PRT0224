package Ficha_02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        // Apresentar o maior
        if (num1 > num2) {
            System.out.println("Maior num1: " + num1);
        } else {
            if (num2 > num1) {
                System.out.println("Maior num2: " + num2);
            } else {
                System.out.println("São iguais!");
            }

        }

    }
}
