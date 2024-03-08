package Ficha_05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar;
        boolean jaTemPar = false;

        System.out.println("**************************");

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maiorPar = -1;

        // Encontrar o maior par
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {

                if (!jaTemPar) {
                    maiorPar = vetor[i];
                    jaTemPar=true;
                }

                if (vetor[i] > maiorPar) {
                    maiorPar = vetor[i];
                }

            }
        }

        // Apresentar o maior par
        if(maiorPar%2==0){
            System.out.println("Maior Par: "+maiorPar);
        }else{
            System.out.println("Não tem pares!");
        }
    }
}
