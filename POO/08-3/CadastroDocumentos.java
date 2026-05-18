import java.util.ArrayList;

/**
 * Classe principal que simula o cadastro e a exibicao dos documentos.
 */
public class CadastroDocumentos {
    public static void main(String[] args) {
        FabricaDocumentos fabrica = new FabricaDocumentos();
        ArrayList<Documento> documentos = new ArrayList<>();

        Documento carta = fabrica.criarDocumento(
                "CARTA",
                1,
                "Jo\u00e3o Silva",
                "Maria Souza",
                "Prezada Maria, encaminho os documentos solicitados para an\u00e1lise.");

        Documento telegrama = fabrica.criarDocumento(
                "TELEGRAMA",
                2,
                "Carlos Lima",
                "Pedro Alves",
                "REUNI\u00c3O CONFIRMADA STOP COMPARECER QUINTA STOP");

        Documento notificacao = fabrica.criarDocumento(
                "NOTIFICACAO",
                3,
                "Departamento Jur\u00eddico",
                "Renova\u00e7\u00e3o de Contrato",
                "Informamos que seu contrato vence em 30 dias. Providencie a renova\u00e7\u00e3o.",
                "15/05/2025");

        documentos.add(carta);
        documentos.add(telegrama);
        documentos.add(notificacao);

        for (Documento doc : documentos) {
            doc.exibir();
            System.out.println();
        }

        try {
            fabrica.criarDocumento("OFICIO", 4, "Teste");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
