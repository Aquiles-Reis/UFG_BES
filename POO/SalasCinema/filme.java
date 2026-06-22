import java.util.ArrayList;

public class Filme {

    private String nome;
    private int ano;
    private String paisOrigem;
    private String lingua;
    private String tipo;

    private ArrayList<Artista> artistas;

    public Filme(String nome, int ano, String paisOrigem,
                  String lingua, String tipo) {

        this.nome = nome;
        this.ano = ano;
        this.paisOrigem = paisOrigem;
        this.lingua = lingua;
        this.tipo = tipo;

        artistas = new ArrayList<>();
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {

        String resultado = "Filme: " + nome +
                           "\nAno: " + ano +
                           "\nPaís: " + paisOrigem +
                           "\nLíngua: " + lingua +
                           "\nTipo: " + tipo +
                           "\nArtistas:\n";

        for (Artista artista : artistas) {
            resultado += "   - " + artista + "\n";
        }

        return resultado;
    }
}