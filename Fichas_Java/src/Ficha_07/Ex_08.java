package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {

    public static double totalVendasTipoProduto(String path, String tipoProduto) throws FileNotFoundException {

        double valorTotal = 0;

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(",");

            if (linhaDividida[0].equalsIgnoreCase(tipoProduto)) {

                double totalLinhaAtual = Double.parseDouble(linhaDividida[2]) * Double.parseDouble(linhaDividida[3]);

                valorTotal += totalLinhaAtual;
            }

        }

        return valorTotal;

    }

    public static double totalVendas(String path) throws FileNotFoundException {

        double valorTotal = 0;

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(",");

            double totalLinhaAtual = Double.parseDouble(linhaDividida[2]) * Double.parseDouble(linhaDividida[3]);

            valorTotal += totalLinhaAtual;

        }

        return valorTotal;

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        double valorTotalVendas, lucroTotal, valorVendaCategoria;
        String filePath = "Ficheiros/exercicio_08.csv";

        valorTotalVendas = totalVendas(filePath);

        System.out.println("Total Vendas: " + valorTotalVendas + " €");

        //__________________________________________________________

        System.out.print("Qual o tipo de produto a pesquisar:");
        String tipoPesquisa = input.nextLine();

        valorVendaCategoria = totalVendasTipoProduto(filePath, tipoPesquisa);
        System.out.println("Vendas de " + tipoPesquisa + ": " + valorVendaCategoria + " €");


    }
}
