package Ficha_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int quantidade, numAnt, numAtual, contador = 1;
        boolean crescente = true;

        // Ler quantidade
        System.out.print("Quantos números deseja inserir: ");
        quantidade = input.nextInt();

        // Ler num
        System.out.print("Insira um número: ");
        numAnt = input.nextInt();

        while (contador < quantidade) {

            // Ler num
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();

            if (numAtual <= numAnt) { // Sequencia deixa de ser crescente
                System.out.println("Sequencia deixou de ser crescente");
                crescente = false;
            }

            numAnt = numAtual;
            contador++;

        }

        if(crescente){ // if (crescente == true)
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
