public class Pessoa {
    private String nome;
    private String nacionalidade;

    public Pessoa(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return nome + " (" + nacionalidade + ")";
    }
}
