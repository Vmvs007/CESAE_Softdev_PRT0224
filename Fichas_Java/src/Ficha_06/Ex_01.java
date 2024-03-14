package Ficha_06;

public class Ex_01 {

    public static void fazerBarulho(String animal){

        // Passamos o que recebemos por parametro para maiusculas
        animal = animal.toUpperCase();

        switch (animal){
            case "CAO":
                System.out.println("Au au au!");
                break;

            case "GATO":
                System.out.println("Miau!");
                break;

            case "PEIXE":
                System.out.println("Glub Glub!");
                break;

            case "VACA":
                System.out.println("Muuuuu!");
                break;

            case "PORCO":
                System.out.println("Oinc! Oinc!");
                break;

        }

    }

    public static void main(String[] args) {

        System.out.println("*** Bem-vindo ao programa dos barulhos ***");

        fazerBarulho("gato");
        fazerBarulho("GATO");
        fazerBarulho("GaTo");
    }

}
