package Ex_01;

import Ex_01.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double fuselagem, double envergaduraAsas, double alturaCauda, int nMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, fuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void addArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
        } else {
            System.out.println("Arsenal cheio, não adicionou: " + armaNova);
        }
    }

    public void removerArma(Arma armaRemover){
        this.arsenal.remove(armaRemover);
    }

    public void listarArsenal(){
        System.out.print("Arsenal: ");
        System.out.print(this.arsenal);
        System.out.println();
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();


        System.out.println("País Origem: "+this.paisOrigem);

        if(this.camuflagem){
            System.out.println("Camuflado");
        }else{
            System.out.println("Não camuflado");
        }

        this.listarArsenal();

    }
}
