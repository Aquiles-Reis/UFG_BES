public class T {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", "9999-1111");
        Cliente cliente2 = new Cliente("Bruno", "9999-2222");
        Cliente cliente3 = new Cliente("Carla", "9999-3333");

        Conta conta1 = new ContaCorrente(101, cliente1, 1000.00);
        Conta conta2 = new ContaPoupanca(202, cliente2, 1000.00);

        System.out.println("Contas usando referencia do tipo Conta");
        System.out.println(conta1);
        System.out.println(conta2);

        conta1.depositar(100.00);
        conta1.sacar(50.00);
        System.out.println("Depois de depositar e sacar na conta corrente");
        System.out.println(conta1);

        conta2.depositar(100.00);
        conta2.sacar(50.00);
        System.out.println("Depois de depositar e sacar na poupanca");
        System.out.println(conta2);

        ((ContaPoupanca) conta2).atualizaSaldo(10);
        System.out.println("Depois de atualizar a poupanca em 10%");
        System.out.println(conta2);

        ContaCorrente contaCorrente = new ContaCorrente(303, cliente1, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(404, cliente2, 500.00);

        contaPoupanca.atualizaSaldo(5);
        System.out.println("Contas declaradas com seus proprios tipos");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        contaCorrente.transferir(contaPoupanca, 100.00);
        System.out.println("Transferencia de corrente para poupanca");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        ContaSalario contaSalario = new ContaSalario(505, cliente3, 800.00);
        contaSalario.depositar(100.00);
        contaSalario.sacar(50.00);
        System.out.println("Conta salario com taxa menor");
        System.out.println(contaSalario);

        contaSalario.transferir(contaCorrente, 100.00);
        System.out.println("Transferencia de salario para corrente");
        System.out.println(contaSalario);
        System.out.println(contaCorrente);
    }
}
