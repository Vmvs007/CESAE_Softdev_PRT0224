package Ficha_04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numSecreto, tentativas = 0, palpite;

        // Ler numSecreto
        System.out.print("JOGADOR 1: Insira um número de 0 a 100: ");
        numSecreto = input.nextInt();

        do {

            // Ler palpite
            System.out.print("JOGADOR 2: Insira o palpite: ");
            palpite = input.nextInt();

            tentativas++;

            // Dizer de o palpite está acima ou abaixo
            if (palpite > numSecreto) {
                System.out.println("Está muito alto!");
            }

            if (palpite < numSecreto) {
                System.out.println("Está muito baixo!");
            }

        } while (palpite != numSecreto);

        System.out.println("Adivinhaste! Parabéns! Precisaste de " + tentativas + " tentativas!");

    }
}
