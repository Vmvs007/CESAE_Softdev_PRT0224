package Ex_02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabrico;

    private int potenciaCv;
    private int cc;
    private double consumo;
    private TipoCombustivel combustivel;

    public Veiculo(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, double consumo, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.consumo = consumo;
        this.combustivel = combustivel;
    }

    public void ligar() {
        System.out.println("O carro está ligado");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano Fabrico: " + this.anoFabrico);
    }

    public Veiculo corrida(Veiculo adversario) {

        if (this.potenciaCv > adversario.potenciaCv) {
            // Meu carro ganha por cv
            return this;
        } else {

            if (this.potenciaCv < adversario.potenciaCv) {
                // Ganha adv por cv
                return adversario;
            } else {
                // Empate de cv

                if (this.cc > adversario.cc) {
                    // Meu carro ganha por cc
                    return this;
                } else {

                    if (this.cc < adversario.cc) {
                        // Ganha adv por cc
                        return adversario;
                    } else {

                        // Empate de cc

                        if (this.anoFabrico > adversario.anoFabrico) {
                            // Meu carro ganha por ser recente
                            return this;
                        } else {

                            if (this.anoFabrico < adversario.anoFabrico) {
                                // Ganha o adv por recente
                                return adversario;
                            } else {
                                // Empate
                                return null;
                            }

                        }
                    }


                }

            }


        }
    }

    public double calcularConsumo(double distancia) {
        return (this.consumo * distancia) / 100;
    }

    public double calcularCusto(double distancia) {
        switch (this.combustivel) {
            case GASOLINA:
                return calcularConsumo(distancia) * 2.1;

            case DIESEL:
                return calcularConsumo(distancia) * 1.95;

            case GPL:
                return calcularConsumo(distancia) * 1.15;

            case ELETRICO:
                return calcularConsumo(distancia) * 0.12;
        }

        return 0;
    }
}
