package Ex_01;

import Ex_01.Enums.Arma;
import Ex_01.Enums.CategoriaJato;
import Ex_01.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoPrivado gulfstream = new JatoPrivado(12345,"Gulfstream S22",2005,4500,15.5,7,2.2,2,1900,650,250,12,200, CategoriaJato.LIGHT_JET);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.TOMADAS);
        gulfstream.addInstalacao(Instalacao.SUITE);
        gulfstream.addInstalacao(Instalacao.COZINHA);

        JatoPrivado cessna = new JatoPrivado(444,"Cessna 65",2012,3900,8,6,3.1,3,3000,1200,2500,30,3000,CategoriaJato.MIDSIZE_JET);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.CINEMA);
        cessna.addInstalacao(Instalacao.COZINHA);

        JatoPrivado boeing = new JatoPrivado(2233,"Boeing 747",2010,9600,12.5,7.6,3.2,4,5800,980,5000,50,4000,CategoriaJato.HEAVY_JET);
        boeing.addInstalacao(Instalacao.WC);

        AviaoCombate f17 = new AviaoCombate(555,"F17",2012,900,4.3,3,1.5,2,1200,1005,1000,"USA",false);
        f17.addArma(Arma.METRELHADORA);
        f17.addArma(Arma.BOMBAS);
        f17.addArma(Arma.FOGUETES);
        f17.addArma(Arma.TORPEDOS);

        AviaoCombate f22 = new AviaoCombate(777,"F22",2022,650,6.3,1.9,0.8,2,2000,1900,6000,"USA",true);
        f22.addArma(Arma.METRELHADORA);


        Catalogo loja = new Catalogo();

        loja.comprar(gulfstream);
        loja.comprar(cessna);
        loja.comprar(boeing);
        loja.comprar(f17);
        loja.comprar(f22);


        System.out.println("Valor Total do Stock: "+loja.calcularTotalCatalogo());
        loja.imprimirCatalogo();

    }
}
