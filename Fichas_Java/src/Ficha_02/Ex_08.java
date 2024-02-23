package Ficha_02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, mediaPonderada;

        System.out.println("****** Programa Aprovado/Reprovado ******\n");

        // Ler nota1
        System.out.print("Insira a nota1: ");
        nota1 = input.nextDouble();

        // Ler nota2
        System.out.print("Insira a nota2: ");
        nota2 = input.nextDouble();

        // Ler nota3
        System.out.print("Insira a nota3: ");
        nota3 = input.nextDouble();

        // Calcular a media ponderada
        mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        System.out.println("Media Ponderada: " + mediaPonderada);

        // Avaliar a aprovação
        if (mediaPonderada >= 9.5) { // Aprovado

            System.out.println("Aprovado! Parabéns!");

        } else { // Reprovado

            System.out.println("Reprovado! Estudasses!");

        }


        System.out.println("\n****** Fim do Programa ******");

    }
}
