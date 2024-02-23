package Ficha_02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, movimento, saldoAposMovimento;

        System.out.println("****** Programa de Creditos/Débitos Bancários ******\n");

        // Ler saldo
        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        // Ler movimento
        System.out.print("Insira o valor a movimentar: ");
        movimento = input.nextDouble();

        saldoAposMovimento = saldo + movimento;

        if (saldoAposMovimento >= 0) { // Operação Válida
            saldo = saldoAposMovimento;
        } else { // Operação Inválida
            System.out.println("Operação Inválida! Saldo insuficiente.");
        }

        // Apresentar o saldo
        System.out.println("\nSaldo Atual: " + saldo + "€");

    }
}
