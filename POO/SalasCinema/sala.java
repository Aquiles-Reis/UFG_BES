import java.util.ArrayList;

public class SalaCinema {

    private int numero;
    private String nome;
    private String localizacao;

    private ArrayList<Filme> filmes;

    public SalaCinema(int numero, String nome, String localizacao) {

        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;

        filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    @Override
    public String toString() {

        String resultado = "Sala " + numero +
                           " - " + nome +
                           "\nLocalização: " + localizacao +
                           "\nFilmes:\n";

        for (Filme filme : filmes) {
            resultado += filme + "\n";
        }

        return resultado;
    }
}