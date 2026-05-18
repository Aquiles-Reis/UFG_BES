public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo);
    }

    protected double getTaxa() {
        return 0.05;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + getTaxa();

        if (valor > 0 && saldo >= valorComTaxa) {
            saldo = saldo - valorComTaxa;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor - getTaxa();
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente\n" + super.toString();
    }
}
