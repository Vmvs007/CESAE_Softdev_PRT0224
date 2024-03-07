package Ficha_05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double total = 0;

        // Ler comissoes
        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Insira valor em comissoes[" + i + "]: ");
            comissoes[i] = input.nextDouble();
        }

        // Descobrir o total
        for (int i = 0; i < comissoes.length; i++) {
            total = total + comissoes[i];
        }

        // Apresentar o total
        System.out.println("Total: " + total + "€");

    }
}
