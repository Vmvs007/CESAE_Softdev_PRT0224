package Ficha_03;

import java.util.Scanner;

public class Ex_08_v2 {
    public static void main(String[] args) {
        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, ant, suc;

        // Ler num
        System.out.print("Insira um número: ");
        num = input.nextInt();

        ant = num - 5;
        suc = num + 5;

        while (ant <= suc) {

            if(ant!=num){
                System.out.println(ant);
            }else{
                System.out.println();
            }

            ant = ant + 1;
        }
    }
}
