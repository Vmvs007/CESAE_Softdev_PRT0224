package Ex_01;

public class Pessoa {
    private String nome;
    private double altura;
    private int idade;

    /**
     * Método construtor para um novo paciente
     *
     * @param nome      Nome Civil da <b>Pessoa</b>
     * @param altura    Altura (m.)
     * @param idade     Idade da Pessoa
     */
    public Pessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }



    public String getNome() {
        return this.nome;
    }

    public double getAltura() {
        return this.altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void apresentar() {
        System.out.println("Olá! Eu sou " + this.nome + "! Tudo bem?");
    }

}
