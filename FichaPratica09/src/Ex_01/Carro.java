package Ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    private int potenciaCv;
    private int cc;
    private double consumo;
    private TipoCombustivel combustivel;

    public Carro(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, double consumo, TipoCombustivel combustivel) {
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

    public Carro corrida(Carro adversario) {

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

}
