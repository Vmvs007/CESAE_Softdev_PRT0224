package Ficha_03;

public class Ex_07 {
    public static void main(String[] args) {

        // Declarar variáveis
        int num = 1, somatorio = 0;

        while (num <= 100) {
            System.out.println(num);
            somatorio = somatorio + num;
            num = num + 1;
        }

        System.out.println("Somatório: " + somatorio);


    }
}
