import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        CadastroMorador cadastroSimples = new CadastroMorador();
        cadastroSimples.cadastrar("Marina", "Bloco A", 101, "AC-001");
        cadastroSimples.cadastrar("Pedro", "Bloco B", 204, "AC-002");

        System.out.println();

        CadastroMoradorLista cadastroLista = new CadastroMoradorLista();
        cadastroLista.adicionar("Alice", "Bloco C", 301, "AC-003");
        cadastroLista.adicionar("Rafael", "Bloco A", 110, "AC-004");
        cadastroLista.adicionar("Bianca", "Bloco D", 412, "AC-005");
        cadastroLista.mostrarLista();
    }
}

class Morador {
    private static int proximoCodigoSequencial = 1;

    private int codigoSequencial;
    private String nome;
    private String bloco;
    private int apartamento;
    private String codigoAcesso;

    public Morador(String nome, String bloco, int apartamento, String codigoAcesso) {
        this.codigoSequencial = proximoCodigoSequencial++;
        this.nome = nome;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public String toString() {
        return "Codigo sequencial: " + codigoSequencial
                + " | Nome: " + nome
                + " | Bloco: " + bloco
                + " | Apartamento: " + apartamento
                + " | Codigo de acesso: " + codigoAcesso;
    }
}

class CadastroMorador {
    public void cadastrar(String nome, String bloco, int apartamento, String codigoAcesso) {
        Morador morador = new Morador(nome, bloco, apartamento, codigoAcesso);
        System.out.println("Morador cadastrado:");
        System.out.println(morador);
    }
}

class CadastroMoradorLista {
    private List<Morador> moradores = new ArrayList<>();

    public void adicionar(String nome, String bloco, int apartamento, String codigoAcesso) {
        moradores.add(new Morador(nome, bloco, apartamento, codigoAcesso));
    }

    public void mostrarLista() {
        System.out.println("Lista de moradores cadastrados:");
        for (Morador morador : moradores) {
            System.out.println(morador);
        }
    }
}
