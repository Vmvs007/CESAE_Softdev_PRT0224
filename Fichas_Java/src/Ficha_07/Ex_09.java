package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PropertyPermission;
import java.util.Scanner;

import static Ficha_07.Ex_07.contarLinhasFicheiro;

public class Ex_09 {

    /**
     * Método que imprime uma matriz de Strings na consola
     *
     * @param matriz Matriz a ser impressa
     */
    public static void imprimirMatrizStrings(String[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }


    /**
     * Método que conta as colunas de um ficheiro estruturado (ex: .csv)
     *
     * @param path        Caminho para o ficheiro
     * @param delimitador Delimitador que separa as colunas
     * @return Número de Colunas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunas(String path, String delimitador) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        String[] linhaDividida = linha.split(delimitador);

        int numeroColunas = linhaDividida.length;

        return numeroColunas;
    }

    /**
     * Método que lê um ficheiro estruturado para uma matriz
     *
     * @param path Caminho para o ficheiro
     * @return Matriz preenchida com o conteúdo do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String path) throws FileNotFoundException {

        // Declarar matriz á medida
        String[][] matrizCompleta = new String[contarLinhasFicheiro(path) - 1][contarColunas(path, ",")];

        // Scanner
        Scanner leitura = new Scanner(new File(path));

        // Linha atual
        String linha = leitura.nextLine();

        int contadorLinha = 0;

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(",");

            for (int i = 0; i < matrizCompleta[0].length; i++) {
                matrizCompleta[contadorLinha][i] = linhaDividida[i];
            }

            contadorLinha++;

        }

        return matrizCompleta;

    }

    /**
     * Método que, dado um género, imprime na consola todas as músicas desse género
     *
     * @param matrizCompleta Matriz com as músicas todas
     * @param generoPesquisa Género a pesquisar
     */
    public static void musicaPorGenero(String[][] matrizCompleta, String generoPesquisa) {

        System.out.println();

        for (int linha = 0; linha < matrizCompleta.length; linha++) {

            if (matrizCompleta[linha][2].equalsIgnoreCase(generoPesquisa)) {

                System.out.println("Nome: " + matrizCompleta[linha][0]);
                System.out.println("Artista: " + matrizCompleta[linha][1]);
                System.out.println("Género: " + matrizCompleta[linha][2]);
                System.out.println("Duracao: " + matrizCompleta[linha][3]);

                System.out.println("___________________________________________________________________");

            }

        }

    }


    /**
     * Método que imprime a música mais longa
     *
     * @param matrizCompleta Matriz com as músicas todas
     */
    public static void musicaMaisLonga(String[][] matrizCompleta) {

        String duracaoString;
        int minutos, segundos;
        int minutosMusicaMaisLonga = 0, segundosMusicaMaisLonga = 0;
        String nome="", genero="", artista="";

        // Ciclo de iteração da matriz
        for (int linha = 0; linha < matrizCompleta.length; linha++) {

            duracaoString = matrizCompleta[linha][3];

            String[] duracaoDividida = duracaoString.split(":");

            minutos = Integer.parseInt(duracaoDividida[0]);
            segundos = Integer.parseInt(duracaoDividida[1]);

            if(minutos==minutosMusicaMaisLonga){

                if(segundos>segundosMusicaMaisLonga){
                    // Musica mais longa porque tem os mesmos minutos mas mais segundos
                    minutosMusicaMaisLonga=minutos;
                    segundosMusicaMaisLonga=segundos;

                    nome=matrizCompleta[linha][0];
                    artista=matrizCompleta[linha][1];
                    genero=matrizCompleta[linha][2];
                }

            }

            if(minutos>minutosMusicaMaisLonga){
                // Musica mais longa porque tem mais minutos
                minutosMusicaMaisLonga=minutos;
                segundosMusicaMaisLonga=segundos;

                nome=matrizCompleta[linha][0];
                artista=matrizCompleta[linha][1];
                genero=matrizCompleta[linha][2];
            }

        }

        System.out.println("Nome: "+nome);
        System.out.println("Artista: "+artista);
        System.out.println("Genero: "+genero);
        System.out.println("Duração: "+minutosMusicaMaisLonga+"m "+segundosMusicaMaisLonga+"s");



    }

    public static void main(String[] args) throws FileNotFoundException {

        // Caminho para o ficheiro
        String path = "Ficheiros/exercicio_09.csv";

        // Matriz completa
        String[][] matrizFicheiro = lerFicheiroParaMatriz(path);

        // imprimirMatrizStrings(matrizFicheiro);

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {
            System.out.println("\n\n*** Programa da Playlist ***\n");
            System.out.println("1. Pesquisar Músicas por Género");
            System.out.println("2. Pesquisar Músicas por Artista");
            System.out.println("3. Música com Maior Duração");
            System.out.println("4. Músicas com Duração Acima de X");
            System.out.println("5. Número de Músicas do Ficheiro");
            System.out.println("6. Sair");

            System.out.print("\nInsira a opção: ");
            opcao = input.nextInt();

            // Enter
            System.out.println();

            switch (opcao) {

                case 1: // Pesquisar músicas por género
                    System.out.println("Pesquisar músicas por género");
                    System.out.println("Género a pesquisar: ");
                    String genero = input.nextLine();
                    genero = input.nextLine();

                    musicaPorGenero(matrizFicheiro, genero);

                    break;

                case 2: // Pesquisar músicas por artista
                    System.out.println("Pesquisar músicas por artista");
                    break;

                case 3: // Música com maior duração
                    System.out.println("Música com maior duração");
                    musicaMaisLonga(matrizFicheiro);
                    break;

                case 4: // Músicas com duração acima de x
                    System.out.println("Músicas com duração acima de x");

                    break;

                case 5: // Número de músicas no ficheiro
                    System.out.println("Número de músicas no ficheiro");
                    System.out.println(matrizFicheiro.length);
                    break;

                case 6: // Sair
                    System.out.println("Obrigado! Até à próxima!!!");
                    break;

                default: // Opção inválida
                    System.out.println("⚠\uFE0F⚠\uFE0F Opção Inválida ⚠\uFE0F⚠\uFE0F");

            }


        } while (opcao != 6);


    }
}
