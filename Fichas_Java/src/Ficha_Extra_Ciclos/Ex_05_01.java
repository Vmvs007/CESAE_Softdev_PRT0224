package Ficha_Extra_Ciclos;

public class Ex_05_01 {
    public static void main(String[] args) {
        int linhas = 4; // Número de linhas a serem impressas

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
