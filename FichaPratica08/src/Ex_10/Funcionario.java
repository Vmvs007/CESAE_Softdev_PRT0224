package Ex_10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario + " €");
        System.out.println("Departamento: " + this.departamento);
    }

    public void aumentarSalario(double aumento) {
        this.salario = this.salario + (this.salario * (aumento / 100));
    }
}
