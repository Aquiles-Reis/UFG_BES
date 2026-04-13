public class Cadastro {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");
        cliente.setTelefone("9823-2323");
        cliente.setIdade(20);

        System.out.println("Exibicao com gets:");
        System.out.println("Cliente: " + cliente.getNome()
                + " - Idade: " + cliente.getIdade()
                + " - Telefone: " + cliente.getTelefone());

        System.out.println("\nExibicao com toString:");
        System.out.println(cliente);

        System.out.println("\nCadastro multiplo:");
        CadastroMultiplo.main(args);
    }
}

class CadastroMultiplo {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("Maria");
        clientes[0].setIdade(20);
        clientes[0].setTelefone("999-8899");

        clientes[1] = new Cliente("Carlos");
        clientes[1].setIdade(31);
        clientes[1].setTelefone("9888-1122");

        clientes[2] = new Cliente("Fernanda");
        clientes[2].setIdade(27);
        clientes[2].setTelefone("9777-5544");

        clientes[3] = new Cliente("Aline");
        clientes[3].setIdade(22);
        clientes[3].setTelefone("9666-7788");

        clientes[4] = new Cliente("Bruno");
        clientes[4].setIdade(29);
        clientes[4].setTelefone("9555-3322");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

class Cliente {
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | Idade: " + idade + " | Telefone: " + telefone;
    }
}
