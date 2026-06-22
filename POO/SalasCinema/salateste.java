import static org.junit.Assert.*;
import org.junit.Test;

public class SalaCinemaTest {

    @Test
    public void deveAdicionarFilmeNaSala() {

        SalaCinema sala =
                new SalaCinema(1,
                               "Sala Principal",
                               "Térreo");

        Filme filme =
                new Filme("Avatar",
                           2022,
                           "Estados Unidos",
                           "Inglês",
                           "Ficção");

        sala.adicionarFilme(filme);

        assertEquals(1,
                     sala.getFilmes().size());

        assertEquals("Avatar",
                     sala.getFilmes()
                         .get(0)
                         .getNome());
    }
}