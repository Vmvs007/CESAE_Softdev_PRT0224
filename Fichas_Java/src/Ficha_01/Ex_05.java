package Ficha_01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, mediaArit, mediaPond;

        // Ler nota1
        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();

        // Ler nota2
        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();

        // Ler nota3
        System.out.print("Nota 3: ");
        nota3 = input.nextDouble();

        // Calcular a media aritmetica
        mediaArit = (nota1 + nota2 + nota3) / 3;

        // Apresentar a media aritmetica
        // \n é para dar enter nos prints
        System.out.println("\nMédia Aritmética: " + mediaArit);

        // Calcular a media ponderada
        mediaPond = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

        // Apresentar a media ponderada
        System.out.println("Média Ponderada: " + mediaPond);
    }
}
