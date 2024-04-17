package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{

    public Mota(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, double consumo, TipoCombustivel combustivel) {
        super(marca, modelo, anoFabrico, potenciaCv, cc, consumo, combustivel);
    }

    public void imprimirImagem() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("mota.txt"));

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
