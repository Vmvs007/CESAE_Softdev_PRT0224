package Ficha_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int base, altura, perimetro, area;

        // Ler base
        System.out.print("Introduza a base: ");
        base = input.nextInt();

        // Ler altura
        System.out.print("Introduza a altura: ");
        altura = input.nextInt();

        // Calcular o perimetro
        perimetro = base + base + altura + altura;

        // Calcular a area
        area = base * altura;

        // Apresentar
        System.out.println("Perímetro: " + perimetro + " m.");
        System.out.println("Área: " + area + " m/2");
    }
}
