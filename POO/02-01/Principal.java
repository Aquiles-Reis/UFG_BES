public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 20, "Feminino", "(11) 99999-1111");
        Pessoa pessoa2 = new Pessoa("Bruno", 25, "Masculino", "(11) 98888-2222");
        Pessoa pessoa3 = new Pessoa("Carla", 22, "Feminino", "(11) 97777-3333");

        Contato contato1 = new Contato("Loja Centro", "(11) 4002-8922", "centro@loja.com", "Vendas");
        Contato contato2 = new Contato("Loja Norte", "(11) 3456-7890", "norte@loja.com", "Financeiro");
        Contato contato3 = new Contato("Loja Sul", "(11) 3123-4567", "sul@loja.com", "Suporte");

        System.out.println("Dados das pessoas cadastradas:");
        System.out.println(pessoa1.retornarDados());
        System.out.println(pessoa2.retornarDados());
        System.out.println(pessoa3.retornarDados());

        System.out.println();
        System.out.println("Contatos cadastrados:");
        System.out.println(contato1);
        System.out.println(contato2);
        System.out.println(contato3);
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;

    public Pessoa(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String retornarDados() {
        return "Nome: " + nome
                + " | Idade: " + idade
                + " | Sexo: " + sexo
                + " | Telefone: " + telefone;
    }
}

class Contato {
    private String nome;
    private String telefone;
    private String email;
    private String setor;

    public Contato(String nome, String telefone, String email, String setor) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Contato{" 
                + "nome='" + nome + '\''
                + ", telefone='" + telefone + '\''
                + ", email='" + email + '\''
                + ", setor='" + setor + '\''
                + '}';
    }
}
