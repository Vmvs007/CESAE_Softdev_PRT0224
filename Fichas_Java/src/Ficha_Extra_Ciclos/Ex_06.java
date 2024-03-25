package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 1, min = 0, max = 0;

        // Ler num pela primeira vez
        System.out.print("Introduza um número (0 para terminar): ");
        num = input.nextInt();

        // Inicializa o máximo e mínimo com o primeiro número inserido
        min = num;
        max = num;

        // Ciclo que vair correr enquanto o número inserido não for 0
        while (num != 0) {

            // Ler num
            System.out.print("Introduza um número (0 para terminar): ");
            num = input.nextInt();

            // Se o número for menor que o número mais pequeno atual
            if (num < min && num!=0) {
                min = num;
            }

            // Se o número for maior que o número mais maior atual
            if (num > max && num!=0) {
                max = num;
            }
        }

        System.out.println("Menor número introduzido: " + min);
        System.out.println("Maior número introduzido: " + max);
    }

}

