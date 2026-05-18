/**
 * Produto concreto que representa um telegrama criado pela fabrica.
 */
public class Telegrama extends Documento {
    private final String destinatario;
    private final String mensagem;

    public Telegrama(int numero, String remetente, String destinatario, String mensagem) {
        super(numero, remetente, "TELEGRAMA");
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    @Override
    public void exibir() {
        System.out.println("==============================");
        System.out.println("TELEGRAMA N\u00ba " + getNumero());
        System.out.println("REMETENTE: " + getRemetente());
        System.out.println("DESTINAT\u00c1RIO: " + destinatario);
        System.out.println("MENSAGEM: " + mensagem);
        System.out.println("==============================");
    }
}
