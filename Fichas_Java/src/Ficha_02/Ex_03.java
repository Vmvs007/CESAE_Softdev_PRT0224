package Ficha_02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, impostos;

        // Ler salario
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if(salario<=15000){
            // Imposto de 20%
            impostos = salario * 0.2;
            System.out.println("Impostos de 20: " + impostos + "€");
        }

        if(salario>15000 && salario<=20000){
            // Imposto de 30%
            impostos = salario * 0.3;
            System.out.println("Impostos de 30: " + impostos + "€");
        }

        if(salario>20000 && salario<=25000){
            // Imposto de 35%
            impostos = salario * 0.35;
            System.out.println("Impostos de 35: " + impostos + "€");
        }

        if(salario>25000){
            // Imposto de 40%
            impostos = salario * 0.4;
            System.out.println("Impostos de 40: " + impostos + "€");
        }

    }
}
