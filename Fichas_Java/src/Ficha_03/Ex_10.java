package Ficha_03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, iterador = 2;

        // Ler num
        System.out.print("Insira um número: ");
        num = input.nextInt();

        while (iterador <= num) {
            System.out.println(iterador);
            iterador = iterador + 2;
        }

    }
}
