package Ficha_02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;
        String escolha;

        // Ler a
        System.out.println("Insira a: ");
        a = input.nextInt();

        // Ler b
        System.out.println("Insira b: ");
        b = input.nextInt();

        // Ler c
        System.out.println("Insira c: ");
        c = input.nextInt();

        // Ler escolha
        System.out.print("Crescente (C) ou Decrescente (D): ");
        escolha = input.next();


        switch (escolha) {
            case "C":

                if (a < b && a < c) {

                    if (b < c) { // abc
                        System.out.println(a + " " + b + " " + c);
                    } else { // acb
                        System.out.println(a + " " + c + " " + b);
                    }

                }


                if (b < a && b < c) {

                    if (a < c) { // bac
                        System.out.println(b + " " + a + " " + c);
                    } else { // bca
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (c < a && c < b) {

                    if (a < b) { // cab
                        System.out.println(c + " " + a + " " + b);
                    } else { // cba
                        System.out.println(c + " " + b + " " + a);
                    }

                }
                break;

            case "D":

                if (a < b && a < c) {

                    if (b < c) { // cba
                        System.out.println(c + " " + b + " " + a);
                    } else { // bca
                        System.out.println(b + " " + c + " " + a);
                    }

                }


                if (b < a && b < c) {

                    if (a < c) { // cab
                        System.out.println(c + " " + a + " " + b);
                    } else { // acb
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (c < a && c < b) {

                    if (a < b) { // bac
                        System.out.println(b + " " + a + " " + c);
                    } else { // abc
                        System.out.println(a + " " + b + " " + c);
                    }

                }
                break;
        }




    }
}
