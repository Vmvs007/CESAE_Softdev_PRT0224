package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class Ex_07 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Declarar variáveis
            int numero=1,contNegativos = 0,contPositivos = 0;

            // Ciclo que vai perguntar números ao utilizador até que introduza o 0
            while (numero!=0) {

                // Ler numero
                System.out.print("Introduza um número (0 para terminar): ");
                numero = input.nextInt();


                if (numero < 0) { // Se for negativo, aumenta contador de negativos
                    contNegativos++;
                } else if (numero > 0) { // Se for positivo, aumenta contador de positivos
                    contPositivos++;
                }
            }

            System.out.println("Quantidade de números negativos: " + contNegativos);
            System.out.println("Quantidade de números positivos: " + contPositivos);

        }
}
