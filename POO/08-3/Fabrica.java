/**
 * Criador abstrato que declara o Factory Method para documentos.
 */
public abstract class Fabrica {
    public abstract Documento criarDocumento(String tipo, int numero, String remetente, String... extras);

    public void registrar(Documento doc) {
        doc.exibir();
    }
}
