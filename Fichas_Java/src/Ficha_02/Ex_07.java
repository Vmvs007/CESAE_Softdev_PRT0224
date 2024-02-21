package Ficha_02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Ler num
        System.out.print("Insira um número: ");
        num = input.nextInt();

        // Avaliar se é ou não par
        if (num % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

    }
}
