package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {

    public static void imprimirFicheiroConsola(String path) throws FileNotFoundException {

        // Instanciar um Scanner para o Ficheiro que foi passado por parâmetro
        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {


        imprimirFicheiroConsola("icheiros/exercicio_01.txt");
        imprimirFicheiroConsola("Ficheiros/exercicio_01_Alternativa01.txt");
        imprimirFicheiroConsola("Ficheiros/exercicio_01_Alternativa02.txt");


    }

}
