package Ex_02;

public class Camiao extends Veiculo{

    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, double consumo, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potenciaCv, cc, consumo, TipoCombustivel.DIESEL);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double viagem(double distancia, double carga){

        if(carga>this.capacidadeCarga){
            System.out.println("Carga ultrapassa a capacidade...");
            return 0;
        }else{
            // Consumo total sem carga
            double consumoTotal = calcularConsumo(distancia);

            // Incrementar o consumo extra da carga
            int consumoCarga = (int) (carga/100);

            consumoTotal+= consumoCarga*0.1;

            return consumoTotal*1.95;
        }

    }

    @Override
    public void exibirDetalhes(){
        System.out.println("*** Detalhes do Camião ***");
        super.exibirDetalhes();
        System.out.println("Cap. Carga: "+this.capacidadeCarga+" Kg.");
    }
}
