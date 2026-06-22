import static org.junit.Assert.*;
import org.junit.Test;

public class FilmeTest {

    @Test
    public void deveAdicionarArtistaNoFilme() {

        Filme filme =
                new Filme("Titanic",
                           1997,
                           "Estados Unidos",
                           "Inglês",
                           "Drama");

        Artista artista =
                new Artista("Leonardo DiCaprio",
                             51,
                             "Americana");

        filme.adicionarArtista(artista);

        assertEquals(1,
                     filme.getArtistas().size());

        assertEquals("Leonardo DiCaprio",
                     filme.getArtistas()
                           .get(0)
                           .getNome());
    }
}