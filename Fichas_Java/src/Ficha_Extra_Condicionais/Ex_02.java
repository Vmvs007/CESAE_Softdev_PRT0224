package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Declarar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double pesoTerra, pesoLua;

        // Ler peso
        System.out.print("Insira o seu peso (Kg.): ");
        pesoTerra = input.nextDouble();

        if (pesoTerra > 0) { // Peso válido (maior que 0)

            // Calcular peso na lua
            pesoLua = pesoTerra * 0.16;

            // Apresentar peso na lua
            System.out.println("Peso na Lua: " + pesoLua);

        } else { // Peso inválido
            System.out.println("Peso inválido!");
        }

    }
}
