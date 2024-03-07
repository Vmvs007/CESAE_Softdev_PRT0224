package Ficha_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {

            // Apresentar as opcoes
            System.out.println("\n1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            // Ler opcao
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {

                case 1: // Criar
                    System.out.println("*** Criar ***");
                    break;

                case 2: // Atualizar
                    System.out.println("*** Atualizar ***");
                    break;

                case 3: // Eliminar
                    System.out.println("*** Eliminar ***");
                    break;

                case 4: // Sair
                    System.out.println("*** Sair ***");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }

        } while (opcao != 4);

    }
}
