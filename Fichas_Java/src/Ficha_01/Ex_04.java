package Ficha_01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, pi = 3.14, area;

        // Perguntar o raio
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a área
        area = pi * raio * raio;

        // Apresentar a área
        System.out.println("Área: " + area);
    }
}
