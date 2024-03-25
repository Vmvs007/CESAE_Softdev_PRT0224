package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, numeroInvertido = 0, digito = 0;

        // Ler numero
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        while (numero != 0) {
            // Obtém o último dígito
            digito = numero % 10;

            // Acrescenta o dígito invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Remove o último dígito
            numero /= 10;
        }

        System.out.println("Resultado: " + numeroInvertido);
    }
}
