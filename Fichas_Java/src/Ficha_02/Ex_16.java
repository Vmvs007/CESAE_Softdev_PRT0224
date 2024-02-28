package Ficha_02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, numeroNotas, resto;

        // Ler valor
        System.out.print("Montante a Levantar: ");
        valor = input.nextInt();

        if (valor % 5 == 0) { // Valor válido (multiplo de 5)

            // 200
            numeroNotas = valor / 200;
            System.out.println("Notas de 200: " + numeroNotas);
            valor = valor % 200;

            // 100
            numeroNotas = valor / 100;
            System.out.println("Notas de 100: " + numeroNotas);
            valor = valor % 100;

            // 50
            numeroNotas = valor / 50;
            System.out.println("Notas de 50: " + numeroNotas);
            valor = valor % 50;

            // 20
            numeroNotas = valor / 20;
            System.out.println("Notas de 20: " + numeroNotas);
            valor = valor % 20;

            // 10
            numeroNotas = valor / 10;
            System.out.println("Notas de 10: " + numeroNotas);
            valor = valor % 10;

            // 5
            numeroNotas = valor / 5;
            System.out.println("Notas de 5: " + numeroNotas);


        } else { // Valor inválido
            System.out.println("Valor inválido... Não temos trocos");
        }

    }
}
