/**
 * Criador concreto que decide qual documento instanciar no Factory Method.
 */
public class FabricaDocumentos extends Fabrica {
    @Override
    public Documento criarDocumento(String tipo, int numero, String remetente, String... extras) {
        switch (tipo) {
            case "CARTA":
                // Para CARTA, os extras representam destinatario e mensagem.
                return new Carta(numero, remetente, extras[0], extras[1]);
            case "TELEGRAMA":
                // Para TELEGRAMA, os extras tambem representam destinatario e mensagem.
                return new Telegrama(numero, remetente, extras[0], extras[1]);
            case "NOTIFICACAO":
                // Para NOTIFICACAO, os extras representam assunto, conteudo e data de emissao.
                return new Notificacao(numero, remetente, extras[0], extras[1], extras[2]);
            default:
                // Tipos desconhecidos nao possuem produto concreto correspondente.
                throw new IllegalArgumentException("Tipo de documento inv\u00e1lido: " + tipo);
        }
    }
}
