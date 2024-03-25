package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Declarar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int idade;

        // Ler idade
        System.out.print("Insira a sua idade: ");
        idade = input.nextInt();

        // Se a idade for maior ou igual que 18 - maior de idade
        if( idade >= 18){
            System.out.println("Maior de idade");
        }else{ // Caso contrário (menor de 18)
            System.out.println("Menor de idade");
        }

    }
}
