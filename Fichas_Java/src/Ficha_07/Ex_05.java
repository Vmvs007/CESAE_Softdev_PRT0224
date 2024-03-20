package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    /**
     * Método que retorna o somatório dos inteiros de um ficheiro
     * @param path Caminho para o ficheiro
     * @return Somatório de todos os inteiros
     * @throws FileNotFoundException Caso ficheiro não encontrado
     */
    public static int somarNumerosFicheiro(String path) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path));

        int somatorio = 0;

        while (leitura.hasNextInt()) {
            int numeroAtual = leitura.nextInt();
            somatorio += numeroAtual;
        }

        return somatorio;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int resultado;

        resultado = somarNumerosFicheiro("Ficheiros/exercicio_05_31.txt");
        System.out.println("Soma: " + resultado);

        resultado = somarNumerosFicheiro("Ficheiros/exercicio_05_1999.txt");
        System.out.println("Soma: " + resultado);

    }
}
