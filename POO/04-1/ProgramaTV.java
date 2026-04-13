import java.util.ArrayList;

public class ProgramaTV {
    private static int proximoCodigo = 1;

    private int codigo;
    private String nome;
    private ArrayList<Pessoa> artistas = new ArrayList<Pessoa>();
    private Pessoa diretor;
    private String categoria;

    public ProgramaTV(String nome, String categoria) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public ArrayList<Pessoa> getArtistas() {
        return artistas;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public void setArtistas(Pessoa artista) {
        artistas.add(artista);
    }

    @Override
    public String toString() {
        String programa = codigo + " - " + nome + " (" + categoria + ")\n";
        programa += "Diretor: " + diretor + "\n";
        programa += "Artistas:\n";

        for (Pessoa artista : artistas) {
            programa += artista + "\n";
        }

        return programa;
    }
}
