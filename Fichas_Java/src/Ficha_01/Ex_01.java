package Ficha_01;


import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma;

        System.out.println("Bom dia! Bem-vindo ao meu primeiro programa!");

        // Ler num1
        System.out.print("Insira um número inteiro: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira outro número inteiro: ");
        num2= input.nextInt();

        // Somar num1 com num2
        soma = num1 + num2;

        // Apresentar resultado
        System.out.println("Soma: " + soma );

    }

}
