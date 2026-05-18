public abstract class Conta {
    private int numero;
    private Cliente cliente;
    protected double saldo;

    public Conta(int numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        double saldoAntes = saldo;
        sacar(valor);

        if (saldo < saldoAntes) {
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        String conta = "Conta: " + numero + "\n";
        conta += "Cliente: " + cliente + "\n";
        conta += "Saldo: R$ " + String.format("%.2f", saldo) + "\n";
        return conta;
    }
}
