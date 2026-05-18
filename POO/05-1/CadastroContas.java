import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroContas {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta (0 para sair):"));

        while (numero != 0) {
            String nome = JOptionPane.showInputDialog("Nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Telefone do cliente:");
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial:"));
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Tipo da conta:\n1 - Corrente\n2 - Salario\n3 - Poupanca"));

            Cliente cliente = new Cliente(nome, telefone);
            Conta conta;

            if (tipo == 1) {
                conta = new ContaCorrente(numero, cliente, saldo);
            } else if (tipo == 2) {
                conta = new ContaSalario(numero, cliente, saldo);
            } else {
                conta = new ContaPoupanca(numero, cliente, saldo);
            }

            contas.add(conta);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta (0 para sair):"));
        }

        String mensagem = "Contas cadastradas:\n\n";

        for (Conta conta : contas) {
            mensagem += conta + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
