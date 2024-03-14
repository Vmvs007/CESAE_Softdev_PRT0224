package Ficha_06;

public class Ex_05 {

    /**
     * Método que analisa um array de inteiros e retorna o maior elemento
     *
     * @param vetor Vetor a ser analisado
     * @return Maior elemento
     */
    public static int maior(int[] vetor) {

        int maiorElemento = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
            }
        }

        return maiorElemento;

    }

    /**
     * Método que analisa um vetor de inteiros e retorna o menor elemento
     *
     * @param vetor Vetor a ser analisado
     * @return Menor Elemento
     */
    public static int menor(int[] vetor) {

        int menorElemento = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
            }
        }

        return menorElemento;

    }

    /**
     * Método que analisa um vetor de inteiros e diz se é crescente ou não
     *
     * @param vetor Vetor a analisar
     * @return True: se for crescente || False: se não for crescente
     */
    public static boolean crescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }

        }

        return true;
    }


}
