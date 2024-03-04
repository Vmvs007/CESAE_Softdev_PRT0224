package Ficha_03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int vezes, iterador = 0;
        String mensagem;

        // Ler vezes
        System.out.print("Número de vezes a apresentar a mensagem: ");
        vezes = input.nextInt();

        // Limpeza de buffer - apanhar o enter
        input.nextLine();

        // Ler mensagem
        System.out.print("Introduza a mensagem: ");
        mensagem = input.nextLine();

        // Aprensentar a mensagem x vezes
        while (iterador < vezes) {
            System.out.println(mensagem);
            iterador = iterador + 1;
        }

    }
}
