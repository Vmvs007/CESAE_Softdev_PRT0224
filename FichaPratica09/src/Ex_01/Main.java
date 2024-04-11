package Ex_01;

public class Main {
    public static void main(String[] args) {


        Carro mercedesA45 = new Carro("Mercedes", "A45", 2023, 420, 2000, 15, TipoCombustivel.GASOLINA);
        Carro mataVelhos = new Carro("Mata", "Velhos", 2023, 900, 4000, 35, TipoCombustivel.GPL);
        Carro bolinhas = new Carro("Bolinhas", "Amarelas", 2020, 90, 200, 1.5, TipoCombustivel.DIESEL);
        Carro ferrari = new Carro("Ferrari", "SF90", 2020, 800, 5000, 30, TipoCombustivel.GASOLINA);

        Carro vencedor1 = mercedesA45.corrida(mataVelhos);
        Carro vencedor2 = bolinhas.corrida(ferrari);

        Carro vencedorTotal = vencedor1.corrida(vencedor2);

        if (vencedorTotal == null) {
            System.out.println("Empate");
        } else {
            System.out.println("*** Vencedor ***");
            vencedorTotal.exibirDetalhes();
        }


    }
}
