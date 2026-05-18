public class ContaSalario extends ContaCorrente {
    public ContaSalario(int numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo);
    }

    @Override
    protected double getTaxa() {
        return 0.01;
    }

    @Override
    public String toString() {
        return "Conta Salario\n" + super.toString().replace("Conta Corrente\n", "");
    }
}
