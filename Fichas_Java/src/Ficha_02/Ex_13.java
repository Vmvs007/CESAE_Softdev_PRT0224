package Ficha_02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos;

        // Ler horas
        System.out.print("Insira as horas (00-23): ");
        horas = input.nextInt();

        // Ler minutos
        System.out.print("Insira os minutos (00-59): ");
        minutos = input.nextInt();

        if (horas <= 11) { // AM

            System.out.println(horas + ":" + minutos + " AM");

        } else { // PM

            if(horas!=12){
                horas = horas - 12;
            }

            System.out.println(horas + ":" + minutos + " PM");

        }
    }
}
