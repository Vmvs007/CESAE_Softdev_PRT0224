package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, soma=0, digito;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        // Enquanto houver dígitos no número
        while (numero != 0) {
            // Obtém o último dígito
            digito = numero % 10;

            // Adiciona o dígito à soma
            soma += digito;

            // Remove o último dígito do número
            numero /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);

    }
}
