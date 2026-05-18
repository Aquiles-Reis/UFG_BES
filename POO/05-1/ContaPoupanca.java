public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo);
    }

    public void atualizaSaldo(double percentual) {
        if (percentual > 0) {
            saldo = saldo + (saldo * percentual / 100);
        }
    }

    @Override
    public String toString() {
        return "Conta Poupanca\n" + super.toString();
    }
}
