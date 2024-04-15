package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public double getPremio() {
        return premio;
    }

    public void addParticipante(Pessoa pessoaNova) {
        if (pessoaNova.getIdade() >= 18) {
            this.participantes.add(pessoaNova);
            System.out.println("Inscrição Aceite: " + pessoaNova.getNome());
        } else {
            System.out.println("Inscrição Recusada! " + pessoaNova.getNome() + " tem "+pessoaNova.getIdade() + " anos!");
        }
    }

    public void imprimirParticipantes(){
        System.out.println("**** Lista de Participantes ****");
        for(Pessoa pessoaAtual: this.participantes){
            pessoaAtual.exibirDetalhes();
        }
        System.out.println("__________________________________");
    }

    public Pessoa fazerSorteio(){
        Random rd = new Random();

        int indexVencedor = rd.nextInt(this.participantes.size());

        return this.participantes.get(indexVencedor);

    }
}
