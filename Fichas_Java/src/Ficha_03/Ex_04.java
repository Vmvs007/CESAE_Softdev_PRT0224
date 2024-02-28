package Ficha_03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, num = 0;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (num <= limite) {
            System.out.println(num);
            num = num + 1;
        }

    }
}
