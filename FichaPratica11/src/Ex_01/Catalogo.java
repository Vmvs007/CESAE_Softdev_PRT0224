package Ex_01;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogoAvioes;

    public Catalogo() {
        this.catalogoAvioes = new ArrayList<Aviao>();
    }

    public void comprar(Aviao aviaoNovo) {
        this.catalogoAvioes.add(aviaoNovo);
    }

    public void vender(Aviao aviaoVendido) {
        this.catalogoAvioes.remove(aviaoVendido);
    }

    public double calcularTotalCatalogo() {
        double valorTotal = 0;

        for (Aviao aviaoAtual : this.catalogoAvioes) {
            valorTotal += aviaoAtual.getPreco();
        }

        return valorTotal;
    }

    public void imprimirCatalogo() {

        System.out.println("**************** Catálogo Loja XPTO ****************");
        for (Aviao aviaoAtual : this.catalogoAvioes) {

            aviaoAtual.imprimirDetalhes();

            System.out.println("____________________________________________________");
        }

    }
}
