public class TransformaNomeTest {

    public static void main(String[] args) {
        testMaiusculo();
        testMinusculo();
        testBuscarBranco();
        testInverterNome();
        testQuantidadePalavras();

        System.out.println("Todos os testes passaram");
    }

    public static void testMaiusculo() {
        TransformaNome tnome = new TransformaNome("Maria");
        assertEquals("MARIA", tnome.maiusculo());
    }

    public static void testMinusculo() {
        TransformaNome tnome = new TransformaNome("Maria");
        assertEquals("maria", tnome.minusculo());
    }

    public static void testBuscarBranco() {
        TransformaNome tnome = new TransformaNome("Maria Clara Machado");
        assertEquals(2, tnome.buscarBranco());
    }

    public static void testInverterNome() {
        TransformaNome tnome = new TransformaNome("Maria");
        assertEquals("airaM", tnome.inverterNome());
    }

    public static void testQuantidadePalavras() {
        TransformaNome tnome = new TransformaNome("Maria Clara Machado");
        assertEquals(3, tnome.quantidadePalavras());
    }

    private static void assertEquals(String esperado, String obtido) {
        if (!esperado.equals(obtido)) {
            throw new AssertionError(
                    "Esperado: " + esperado + ", obtido: " + obtido);
        }
    }

    private static void assertEquals(int esperado, int obtido) {
        if (esperado != obtido) {
            throw new AssertionError(
                    "Esperado: " + esperado + ", obtido: " + obtido);
        }
    }
}
