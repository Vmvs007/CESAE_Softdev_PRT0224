package Ficha_02;

import java.util.Scanner;

public class Ex_05 {
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

        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        }else{
            System.out.println(num1 + " " + num2);
        }

    }
}
