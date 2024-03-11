package Ficha_06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Imprime o número de asteriscos passado por parâmetro, na consola
     * @param quantidadeAsteriscos Quantidade de Asteriscos a serem impressos
     */
    public static void imprimirAsteriscos(int quantidadeAsteriscos) {

        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.print("*");
        }

    }

    /**
     * Função que lê números, até que o utilizador introduza um inteiro positivo
     * @return Número Inteiro e Positivo
     */
    public static int lerInteiroPositivo() {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.print("Insira um número inteiro positivo: ");
            num = input.nextInt();
        } while (num < 0);

        return num;
    }



    public static void main(String[] args) {

        int x;

        x = lerInteiroPositivo();
        imprimirAsteriscos(x);
    }
}
