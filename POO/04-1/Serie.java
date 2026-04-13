public class Serie extends ProgramaTV {
    private int quantidadeTemporadas;
    private int quantidadeEpisodios;

    public Serie(String nome, String categoria, int quantidadeTemporadas, int quantidadeEpisodios) {
        super(nome, categoria);
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public int getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public void setQuantidadeTemporadas(int quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    @Override
    public String toString() {
        String serie = super.toString();
        serie += "Temporadas: " + quantidadeTemporadas + "\n";
        serie += "Episodios: " + quantidadeEpisodios + "\n";
        return serie;
    }
}
