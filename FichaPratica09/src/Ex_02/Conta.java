package Ex_02;

public class Conta {
    private String numeroConta;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0;
    private double divida = 0;

    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
        this.margemEmprestimo = 0.9 * this.saldo;
    }

    public void depositar(double valor) {
        System.out.println("Depósito Efetuado: " + valor);
        this.setSaldo(this.saldo + valor);
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Levantamento Efetuado: " + valor);
            this.setSaldo(this.saldo-valor);
        } else {
            System.out.println("Levantamento Recusado. Saldo Insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            System.out.println("Transferencia Efetuada: " + valor);
            this.setSaldo(this.saldo-valor);
            contaDestino.setSaldo(contaDestino.saldo+valor);
        } else {
            System.out.println("Transferência Recusada. Saldo Insuficiente.");
        }
    }

    public void pedirEmprestimo(double valor){
        if(this.divida==0){
            // Não tem dívida

            if(this.margemEmprestimo>=valor){
                // Valor válido
                this.setSaldo(this.saldo+valor);
                this.divida=valor;
            }else{
                // Pediu mais do que o que pode
                System.out.println("Margem de Empréstimo insuficiente");
            }

        }else{
            // Tem dívida
            System.out.println("Dívidas pendentes. Não é possível emprestar mais.");
        }
    }


    public void exibirDetalhes() {
        System.out.println("Numero Conta: " + this.numeroConta + "\t| Titular: " + this.titular + "\t| Saldo: " + this.saldo + " €");
    }
}
