package Ex_01;

import Ex_01.Enums.CategoriaJato;
import Ex_01.Enums.Instalacao;

import java.util.ArrayList;

public class JatoPrivado extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatoPrivado(int numSerie, String modelo, int anoFabrico, double peso, double fuselagem, double envergaduraAsas, double alturaCauda, int nMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, fuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacao>();
    }

    public void addInstalacao(Instalacao instalacaoNova) {
        this.instalacoes.add(instalacaoNova);
    }

    public void removerInstalacao(Instalacao instalacaoRemover) {
        this.instalacoes.remove(instalacaoRemover);
    }

    public void listarInstalacoes() {
        System.out.print("Instalações: ");
        System.out.print(this.instalacoes);
        System.out.println();
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();

        System.out.println("Lotação: "+this.lotacao);
        System.out.println("Capacidade Carga: "+this.capacidadeBagagem+" m3.");
        System.out.println("Categoria: "+this.categoria);
        this.listarInstalacoes();
    }
}
