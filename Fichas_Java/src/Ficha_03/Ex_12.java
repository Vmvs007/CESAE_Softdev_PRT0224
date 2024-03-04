package Ficha_03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 0, intervalo_0_25 = 0, intervalo_26_50 = 0, intervalo_51_75 = 0, intervalo_76_100 = 0;

        while (num >= 0) {

            // Ler num
            System.out.print("Insira um número: ");
            num = input.nextInt();

            if (num >= 0 && num <= 25) {
                intervalo_0_25++;
            }

            if (num >= 26 && num <= 50) {
                intervalo_26_50++;
            }

            if (num >= 51 && num <= 75) {
                intervalo_51_75++;
            }

            if (num >= 76 && num <= 100) {
                intervalo_76_100++;
            }

        }

        System.out.println("\n[00,25]: "+intervalo_0_25);
        System.out.println("[26,50]: "+intervalo_26_50);
        System.out.println("[51,75]: "+intervalo_51_75);
        System.out.println("[76,100]: "+intervalo_76_100);

    }
}
