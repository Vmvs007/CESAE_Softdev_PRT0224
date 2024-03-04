package Ficha_03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, salto, iterador=0;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite= input.nextInt();

        // Ler salto
        System.out.print("Insira o salto: ");
        salto= input.nextInt();

        while (iterador<=limite){
            System.out.println(iterador);
            iterador=iterador+salto;
        }


    }
}
