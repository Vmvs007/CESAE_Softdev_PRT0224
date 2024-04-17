package Ex_02;

public class Main {
    public static void main(String[] args) {

        Carro mercedes = new Carro("Mercedes","A45",2023,420,2000,12.5,TipoCombustivel.GASOLINA,5);
        Carro fiat = new Carro("Fiat","500",2010,75,900,10,TipoCombustivel.DIESEL,2);
        Mota bmw = new Mota("BMW","1200",2015,990,1200,9,TipoCombustivel.GASOLINA);
        Camiao scania = new Camiao("Scania","B15",1990,200,5000,23,1000);

        System.out.println("_______________________________________________\n");
        System.out.println("Corrida 1:");
        Veiculo vencedor = mercedes.corrida(fiat);
        vencedor.exibirDetalhes();

        System.out.println("\n_______________________________________________\n");
        System.out.println("Corrida 2:");
        Veiculo vencedor2 = scania.corrida(bmw);
        vencedor2.exibirDetalhes();

        System.out.println("\n_______________________________________________\n");
        System.out.println("Viagens do Camião:");
        System.out.println("Custo da Viagem: "+scania.viagem(1000,100000));
        System.out.println("Custo da Viagem: "+scania.viagem(1000,150));
    }
}
