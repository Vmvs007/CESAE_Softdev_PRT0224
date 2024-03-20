package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    /**
     * Método que imprime na consola a pessoa mais velha do ficheiro
     * @param path Caminho para o Ficheiro
     * @throws FileNotFoundException Caso Ficheiro não encontrado
     */
    public static void pessoaMaisVelha(String path) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path));

        String linha;
        int idadeMaisVelha = 0;
        String nomeMaisVelha = "";

        while (leitura.hasNextLine()) {

            // Ler linha do ficheiro para variável "linha"
            linha = leitura.nextLine();

            // Dividir a linha pela vírgula ","
            String[] linhaDividida = linha.split(",");

            // Se a linhaDividida[1] como inteiro MAIOR QUE idadeMaisVelha
            if (Integer.parseInt(linhaDividida[1]) > idadeMaisVelha) {
                // Atualizar variáveis para ficar com as informações da pessoa mais velha atual
                idadeMaisVelha = Integer.parseInt(linhaDividida[1]);
                nomeMaisVelha = linhaDividida[0];
            }

        }

        System.out.println("*** Pessoa Mais Velha ***");
        System.out.println("Nome: " + nomeMaisVelha);
        System.out.println("Idade: " + idadeMaisVelha);

    }

    public static void main(String[] args) throws FileNotFoundException {

        pessoaMaisVelha("Ficheiros/exercicio_06.txt");

    }
}
