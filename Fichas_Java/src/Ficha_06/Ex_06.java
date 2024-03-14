package Ficha_06;

import java.util.Scanner;

import static Ficha_06.Ex_03.*;
import static Ficha_06.Ex_05.*;

public class Ex_06 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int opcao, tamanhoVetor;

        // Ler tamanho vetor
        System.out.print("Tamanho do Vetor: ");
        tamanhoVetor = input.nextInt();

        // Declarar vetor
        int[] vetor = new int[tamanhoVetor];

        // Preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        do {

            System.out.println("\n\n***** Análise de um Vetor *****\n");

            // Apresentar as opcoes
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não-Crescente");
            System.out.println("4. Maior Elemento - Primo ou Não");
            System.out.println("5. Sair");

            // Ler opcao
            System.out.print("\nInsira a opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {
                case 1: // Maior elemento
                    int maiorElemento = maior(vetor);
                    System.out.println("Maior Elemento: " + maiorElemento);
                    break;

                case 2: // Menor elemento
                    System.out.println("Menor Elemento: "+ menor(vetor));
                    break;

                case 3: // Crescente ou não

                    if(crescente(vetor)){
                        System.out.println("Crescente");
                    }else{
                        System.out.println("Não Crescente");
                    }

                    break;

                case 4: // Saber se o maior elemento é primo - Exemplo de aula: não estava na ficha

                    if(primo(maior(vetor))){
                        System.out.println("Maior Elemento é Primo");
                    }else{
                        System.out.println("Maior Elemento não é Primo");
                    }

                    break;

                case 5: // Saida
                    System.out.println("Obrigado! Até breve...");
                    break;

                default: // Invalido
                    System.out.println("Opção Inválida!!!");
            }


        } while (opcao != 4);

    }
}
