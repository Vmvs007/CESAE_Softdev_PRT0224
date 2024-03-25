package Ficha_Extra_Ciclos;

public class Ex_04_01 {
    public static void main(String[] args) {

        int linhas = 4; // Número de linhas a serem impressas
        int colunas = 10; // Número de colunas a serem impressas

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}