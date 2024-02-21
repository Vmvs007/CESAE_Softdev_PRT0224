package Ficha_02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, impostos;

        // Ler salario
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        // Avaliar o salário
        if (salario <= 15000) {
            // Pagar taxa de 20%
            impostos = salario * 0.2;
            System.out.println("Impostos de 20: " + impostos + "€");

        } else {
            // Pagar taxa de 30%
            impostos = salario * 0.3;
            System.out.println("Impostos de 30: " + impostos + "€");
        }



    }
}
