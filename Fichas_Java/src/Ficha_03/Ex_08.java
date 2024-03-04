package Ficha_03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, ant, suc;

        // Ler num
        System.out.print("Insira um número: ");
        num = input.nextInt();

        ant = num - 5;
        suc = num + 5;

        // Imprimir os anteriores
        while (ant < num) {
            System.out.println(ant);
            ant = ant + 1;
        }

        num = num + 1;
        System.out.println();

        // Imprimir os seguintes
        while (num <= suc) {
            System.out.println(num);
            num = num + 1;
        }

    }
}
