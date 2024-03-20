package Ficha_06;

public class Recursividade {

    public static void main(String[] args) {
        int numero = 5;

        int resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}