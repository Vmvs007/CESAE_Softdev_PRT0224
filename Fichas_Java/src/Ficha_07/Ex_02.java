package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void criarFicheiroDeTextoComMensagem(String path, String mensagem) throws FileNotFoundException {

        PrintWriter maquinaEscrever = new PrintWriter(new File(path)); // Criar o PrintWriter "maquinaEscrever"

        maquinaEscrever.println(mensagem); // Escrever a mensagem no ficheiro

        maquinaEscrever.close(); // Gravar e fechar o ficheiro

    }

    public static void main(String[] args) throws FileNotFoundException {


        criarFicheiroDeTextoComMensagem("Ficheiros/exercicio_02.txt", "Teste de Escrita em Ficheiro :D");
        criarFicheiroDeTextoComMensagem("Ficheiros/exemplo.txt","Olá Turma de Soft DeV!!!\n123\n456");


    }
}
