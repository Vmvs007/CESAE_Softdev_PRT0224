package Ex_01;

public class Aviao {
    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double fuselagem;
    protected double envergaduraAsas;
    protected double alturaCauda;
    protected int nMotores;
    protected double autonomia;
    protected double velMax;
    protected double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double fuselagem, double envergaduraAsas, double alturaCauda, int nMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.fuselagem = fuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirDetalhes() {
        System.out.println("Num. Série: " + this.numSerie);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano Fabrico: " + this.anoFabrico);
        System.out.println("Num. Motores: " + this.nMotores);
        System.out.println("Autonomia: " + this.autonomia + " Km.");
        System.out.println("Velocidade Max.: " + this.velMax);
        System.out.println("Preço: " + this.preco);
    }


}
