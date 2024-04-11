package Ex_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora maquina = new Calculadora();

        Scanner input = new Scanner(System.in);

        double numero1, numero2;

        String operacao;

        /*
        System.out.println("Soma: "+ maquina.soma(10,4));
        System.out.println("Subtracao: "+ maquina.subtracao(100,99));
        System.out.println("Multiplicacao: "+ maquina.multiplicacao(5,5));
        System.out.println("Divisao: "+ maquina.divisao(10,2));
        */

        while (true) {

            System.out.print("Insira um número: ");
            numero1 = input.nextDouble();

            System.out.print("Operação Aritmética (+ - * /): ");
            operacao = input.next();

            System.out.print("Insira outro número: ");
            numero2 = input.nextDouble();

            System.out.print("Resultado: ");

            switch (operacao) {

                case "+":
                    System.out.println(maquina.soma(numero1,numero2));
                    break;

                case "-":
                    System.out.println(maquina.subtracao(numero1,numero2));
                    break;

                case "*":
                    System.out.println(maquina.multiplicacao(numero1,numero2));
                    break;

                case "/":
                    System.out.println(maquina.divisao(numero1,numero2));
                    break;

            }

            System.out.println();

        }


    }
}
