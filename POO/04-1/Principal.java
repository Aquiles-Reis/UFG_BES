import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList<ProgramaTV>();

        ProgramaTV p = new ProgramaTV("O Outro Lado do Paraiso", "Novela");
        p.setDiretor(new Pessoa("Diretor 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Orgulho e Paixao", "Novela");
        p.setDiretor(new Pessoa("Diretor 2", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Marley e Eu", "Filme");
        p.setDiretor(new Pessoa("Diretor 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Show Ivete Sangalo", "Show");
        p.setDiretor(new Pessoa("Diretor 4", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
        programas.add(p);

        Serie s = new Serie("Breaking Bad", "Serie", 5, 62);
        s.setDiretor(new Pessoa("Vince Gilligan", "Americano"));
        s.setArtistas(new Pessoa("Bryan Cranston", "Americano"));
        s.setArtistas(new Pessoa("Aaron Paul", "Americano"));
        programas.add(s);

        s = new Serie("Round 6", "Serie", 2, 16);
        s.setDiretor(new Pessoa("Hwang Dong-hyuk", "Sul-coreano"));
        s.setArtistas(new Pessoa("Lee Jung-jae", "Sul-coreano"));
        s.setArtistas(new Pessoa("Wi Ha-joon", "Sul-coreano"));
        programas.add(s);

        for (ProgramaTV programa : programas) {
            System.out.println(programa);
        }
    }
}
