package Ficha_02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Apresentar as opcoes
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        // Ler opcao
        System.out.print("Insira a opção: ");
        opcao = input.nextInt();

        //
        switch (opcao){

            case 1:
                System.out.println("*** Criar ***");
                break;

            case 2:
                System.out.println("*** Atualizar ***");
                break;

            case 3:
                System.out.println("*** Eliminar ***");
                break;

            case 4:
                break;

            default:
                System.out.println("*** Opção Inválida ***");

        }


    }
}
