package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    public static void copiarTextoFicheiroParaOutro(String sourcePath, String newFilePath) throws FileNotFoundException {

        // Scanner para o sourceFile
        Scanner leitura = new Scanner(new File(sourcePath));

        // PrintWriter para o newFile
        PrintWriter escrita = new PrintWriter(new File(newFilePath));

        String linha;

        // Copiar do sourceFile para newFile
        while (leitura.hasNextLine()){
            linha=leitura.nextLine();
            escrita.println(linha);
        }

        // Close no PrintWriter para gravar antes de fechar
        escrita.close();

    }


    public static void main(String[] args) throws FileNotFoundException {

        copiarTextoFicheiroParaOutro("Ficheiros/exercicio_03_Alternativa01.txt","Ficheiros/exercicio_03_novoAlt.txt");

    }
}
