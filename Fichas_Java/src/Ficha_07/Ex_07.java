package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {

        int numeroLinhas = 0;

        Scanner leitura = new Scanner(new File(path));

        while (leitura.hasNextLine()) {
            numeroLinhas++;
            leitura.nextLine();
        }

        return numeroLinhas;

    }

    public static int contarPalavrasFicheiro(String path) throws FileNotFoundException {

        int numeroPalavras=0;

        Scanner leitura = new Scanner(new File(path));

        while (leitura.hasNext()){
            numeroPalavras++;
            leitura.next();
        }

        return numeroPalavras;
    }


    public static void main(String[] args) throws FileNotFoundException {

        int nPalavras, nLinhas;

        nPalavras = contarPalavrasFicheiro("Ficheiros/exercicio_07.txt");
        nLinhas = contarLinhasFicheiro("Ficheiros/exercicio_07.txt");

        System.out.println("Número de Palavras: " + nPalavras);
        System.out.println("Número de Linhas: " + nLinhas);

    }
}
