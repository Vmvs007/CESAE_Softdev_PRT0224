package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void criarFicheiroDeTextoComMensagem(String path, String mensagem) throws FileNotFoundException {

        PrintWriter maquinaEscrever = new PrintWriter( new File(path));

        maquinaEscrever.println(mensagem);

        maquinaEscrever.close();

    }

    public static void main(String[] args) {

        try{

            criarFicheiroDeTextoComMensagem("Ficheiros/exercicio_02.txt", "Teste de Escrita em Ficheiro :D");

        }catch (FileNotFoundException e){

        }
    }
}
