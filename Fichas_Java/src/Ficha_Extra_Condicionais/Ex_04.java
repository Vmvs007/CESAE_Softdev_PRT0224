package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Declarar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String letra;

        // Ler letra
        System.out.print("Insira uma letra: ");
        letra = input.next();

        // Passar para minuscula
        letra=letra.toLowerCase();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
                break;

            default:
                System.out.println("Consoante");
        }

    }
}
