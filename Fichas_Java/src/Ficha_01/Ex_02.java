package Ficha_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;

        // Ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        // Calcular a soma
        resultado = num1 + num2;
        System.out.println("Soma: " + resultado);

        // Calcular a subtração
        resultado = num1-num2;
        System.out.println("Subtração: " + resultado);

        // Calcular a mulitiplicação
        resultado = num1*num2;
        System.out.println("Multiplicação: " + resultado);

        // Calcular a divisão
        resultado = num1/num2;
        System.out.println("Divisão: " + resultado);

    }
}
