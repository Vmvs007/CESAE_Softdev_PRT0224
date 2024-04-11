package Ex_02;

public class Cao {

    private String nome;
    private String raca;
    private String latido = "Au au au";

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String novoLatido) {
        this.latido = novoLatido;
    }

    public void ladrar(){
        System.out.println(this.latido);
    }


}
