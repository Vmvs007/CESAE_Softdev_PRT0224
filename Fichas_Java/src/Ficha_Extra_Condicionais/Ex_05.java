package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Declarar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numeroMisterioso = 31;

        System.out.println("Bem-vindo ao jogo de adivinhar o número!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Tem duas tentativas.");

        // Inicializar o contador de tentativas
        int tentativas = 0;

        System.out.print("Tentativa 1: ");
        int palpite = input.nextInt();

        // Acertou
        if (palpite == numeroMisterioso) {
            System.out.println("Parabéns! Acertou no número misterioso!");

        } else { // Não acertou

            if (palpite < numeroMisterioso) {
                System.out.println("O número misterioso é maior.");
            } else {
                System.out.println("O número misterioso é menor.");
            }

            System.out.print("Tentativa 2: ");
            palpite = input.nextInt();

            if (palpite == numeroMisterioso) { // Acertou
                System.out.println("Parabéns! Acertou no número misterioso!");
            } else {

                if (palpite < numeroMisterioso) {
                    System.out.println("O número misterioso é maior.");
                } else {
                    System.out.println("O número misterioso é menor.");
                }

                System.out.println("Ficaste sem tentativas...");
            }
        }


    }
}
