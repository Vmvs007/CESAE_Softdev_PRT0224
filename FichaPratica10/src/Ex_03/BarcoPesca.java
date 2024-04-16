package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;

    private Marca marcaBarco;

    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaBarco = marcaBarco;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }


    public void largarPeixe(int indexRemover) {
        this.peixesPescados.remove(indexRemover);
    }

    public void largarMarisco(int indexRemover) {
        this.mariscoPescado.remove(indexRemover);
    }

    public void pescarPeixe(Peixe peixeNovo) {
        if (peixeNovo.getPeso() > this.capacidadeAtual()) {
            System.out.println("Peixe excede a capacidade atual: " + this.capacidadeAtual());
        } else {
            this.peixesPescados.add(peixeNovo);
            System.out.println("Peixe pescado com sucesso");
        }
    }

    public void pescarMarisco(Marisco mariscoNovo) {
        if (mariscoNovo.getPeso() > this.capacidadeAtual()) {
            System.out.println("Marisco excede a capacidade atual: " + this.capacidadeAtual());
        } else {
            this.mariscoPescado.add(mariscoNovo);
            System.out.println("Marisco pescado com sucesso");
        }
    }

    public double calcularCargaAtual() {
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            cargaAtual += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual += mariscoAtual.getPeso();
        }

        return cargaAtual;
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            total += (peixeAtual.getPeso() * peixeAtual.getPrecoKg());
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            total += (mariscoAtual.getPeso() * mariscoAtual.getPrecoKg());
        }

        return total;
    }

    public double capacidadeAtual() {
        return this.capacidadeCarga - this.calcularCargaAtual();
    }

    public double salarioTripulacao() {
        double valorTotalCarga = this.calcularValorTotal();

        double valorTotalSemCapitacao = valorTotalCarga * 0.6;

        double salarioIndividual = valorTotalSemCapitacao/this.tripulacao;

        return salarioIndividual;
    }
}
