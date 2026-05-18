/**
 * Representa a empresa utilizando o padrao Singleton.
 */
public class Empresa {
    // Instancia unica da propria classe, inicialmente nula.
    private static volatile Empresa instance;

    private final String nome;
    private final String cnpj;
    private final String endereco;
    private final String cep;

    // Construtor privado impede a criacao de objetos fora da classe.
    private Empresa() {
        this.nome = "EBM INCORPORACOES S/A";
        this.cnpj = "03.025.881/0002-74";
        this.endereco = "Rua T 55, 930 SETOR BUENO GOIANIA \u2013 GO";
        this.cep = "74215-170";
    }

    public static Empresa getInstance() {
        // Primeira verificacao evita sincronizacao desnecessaria apos a instancia existir.
        if (instance == null) {
            // Bloco sincronizado garante seguranca em ambientes com multiplas threads.
            synchronized (Empresa.class) {
                // Segunda verificacao garante que apenas uma instancia seja criada.
                if (instance == null) {
                    instance = new Empresa();
                }
            }
        }

        // Retorna sempre a mesma instancia da empresa.
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "CNPJ: " + cnpj + "\n"
                + "Endere\u00e7o: " + endereco + "\n"
                + "CEP: " + cep;
    }
}
