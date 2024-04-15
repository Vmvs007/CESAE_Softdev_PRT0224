package Ex_03;

public class Main {
    public static void main(String[] args) {

        Peixe sardinha = new Peixe("Sardinha", 12, 25);
        Peixe bacalhau = new Peixe("Bacalhau Noruega", 90, 40);
        Peixe robalo = new Peixe("Robalo", 150, 20);

        Marisco caranguejo = new Marisco("Caranguejo", 10, 100);
        Marisco lagosta = new Marisco("Lagosta", 100, 50);

        BarcoPesca bp = new BarcoPesca("Rei dos Mares", "Azul e Branco", 1990, 4, 210, Marca.QUICKSILVER);

        bp.pescarMarisco(caranguejo);
        bp.pescarMarisco(lagosta);

        bp.pescarPeixe(bacalhau);
        bp.pescarPeixe(robalo);
        bp.pescarPeixe(sardinha);

        System.out.println("Valor Total da Carga: " + bp.calcularValorTotal() + " €");
    }
}
