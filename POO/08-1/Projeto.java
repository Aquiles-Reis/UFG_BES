import java.text.NumberFormat;
import java.util.Locale;

/**
 * Representa um projeto pertencente a empresa Singleton.
 */
public class Projeto {
    private final int id;
    private final String nome;
    private final String descricao;
    private final String dataInicio;
    private final String dataFim;
    private final String status;
    private final double orcamento;
    private final Empresa empresa;

    public Projeto(int id, String nome, String descricao, String dataInicio,
            String dataFim, String status, double orcamento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.orcamento = orcamento;
        this.empresa = Empresa.getInstance();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getStatus() {
        return status;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        return "ID: " + id + " | Nome: " + nome + " | Status: " + status + "\n"
                + "Descri\u00e7\u00e3o: " + descricao + "\n"
                + "In\u00edcio: " + dataInicio + " | Fim: " + dataFim + "\n"
                + "Or\u00e7amento: " + formatoMoeda.format(orcamento) + "\n"
                + "Empresa: " + empresa.getNome();
    }
}
