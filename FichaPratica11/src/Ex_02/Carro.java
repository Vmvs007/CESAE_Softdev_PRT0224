package Ex_02;

public class Carro extends Veiculo {

    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, double consumo, TipoCombustivel combustivel, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potenciaCv, cc, consumo, combustivel);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("*** Detalhes do Carro ***");
        super.exibirDetalhes();
        System.out.println("Quant. Passageiros: " + this.quantidadePassageiros);
    }
}
