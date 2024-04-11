package Ex_04;

public class Circulo {

    private double raio;

    /**
     * Método construtor para Circulo
     * @param raio Raio (cm)
     */
    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getArea() {
        return 3.14 * this.raio * this.raio;
    }

    public double getCircunferencia() {
        return 2 * 3.14 * this.raio;
    }
}
