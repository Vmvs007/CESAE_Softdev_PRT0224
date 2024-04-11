package Ex_11;

public class Conta {
    private String numeroConta;
    private double saldo = 0;
    private String titular;

    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void depositar(double valor) {
        System.out.println("Depósito Efetuado: " + valor);
        this.saldo += valor;
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Levantamento Efetuado: " + valor);
            this.saldo -= valor;
        } else {
            System.out.println("Levantamento Recusado. Saldo Insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            System.out.println("Transferencia Efetuada: " + valor);
            this.saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            System.out.println("Transferência Recusada. Saldo Insuficiente.");
        }
    }


public void exibirDetalhes() {
    System.out.println("Numero Conta: " + this.numeroConta + "\t| Titular: " + this.titular + "\t| Saldo: " + this.saldo + " €");
}
}
