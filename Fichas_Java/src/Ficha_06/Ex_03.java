package Ficha_06;

public class Ex_03 {

    /**
     * Função que avalia a paridade de um número
     *
     * @param num Número inteiro
     * @return True: se par || False: se impar
     */
    public static boolean par(int num) {

        if (num % 2 == 0) { // É par
            return true;
        } else { // É impar
            return false;
        }

    }

    /**
     * Função que avalia se um número é ou não positivo
     *
     * @param num Número inteiro
     * @return True: se positivo || False: se negativo
     */
    public static boolean positivo(int num) {

        if (num >= 0) { // Positivo
            return true;
        } else { // Negativo
            return false;
        }
    }


    /**
     * Função que avalia se um número é ou não primo
     * @param num Número inteiro
     * @return True: se primo || False: se não primo
     */
    public static boolean primo(int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) { // Conseguiu dividir por um número que não 1 ou ele mesmo
                return false;
            }
        }

        return true;

    }
}
