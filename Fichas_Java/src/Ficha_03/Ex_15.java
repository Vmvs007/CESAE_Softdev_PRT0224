package Ficha_03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, fatorial = 1;

        // Ler num
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        while (num > 0) {
            fatorial = fatorial * num;
            num--;
        }

        System.out.println("Fatorial: " + fatorial);

    }
}
