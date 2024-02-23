package Ficha_02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        // Ler operação aritmética
        System.out.print("Operação desejada (+ - * /): ");
        operacao = input.next();

        // Escolher qual a operacao aritmética
        switch (operacao) {
            case "+": // Soma
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;

            case "-": // Subtração
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;

            case "*": // Multiplicação
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;

            case "/": // Divisão
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;

            default: // Operação Inválida
                System.out.println("Operação Inválida");
                break; // Break do default é opcional (se o default for a ultima clausula)
        }


    }
}
