public class PessoaTeste {

    public static void main(String[] args) {
        System.out.println("Iniciou serie de testes");

        testFaixa1();
        testFaixa2();
        testFaixa3();
        testFaixa4();
        testFaixa5();
        testMaior65Faixa1();
        testMaior65Faixa2();
        testMaior65Faixa3();
        testMaior65Faixa4();
        testMaior65Faixa5();

        System.out.println("Finalizou serie de testes");
    }

    public static void testFaixa1() {
        Pessoa p = new Pessoa("joao", 1500.00, 0, 20);
        assertEquals(0, p.calculaImposto(), 0);

        p = new Pessoa("maria", 1500.00, 1, 50);
        assertEquals(0, p.calculaImposto(), 0);

        System.out.println("Passou Teste 1 - primeira faixa");
    }

    public static void testFaixa2() {
        Pessoa p = new Pessoa("joao", 2000.00, 0, 60);
        assertEquals(15.91, p.calculaImposto(), 0.1);

        p = new Pessoa("joao", 2000.00, 2, 50);
        assertEquals(0, p.calculaImposto(), 0);

        System.out.println("Passou Teste 2 - segunda faixa");
    }

    public static void testFaixa3() {
        Pessoa p = new Pessoa("paulo", 3500.00, 0, 20);
        assertEquals(189.97, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 3500.00, 1, 20);
        assertEquals(10.26, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 3500.00, 2, 40);
        assertEquals(0, p.calculaImposto(), 0);

        System.out.println("Passou Teste 3 - terceira faixa");
    }

    public static void testFaixa4() {
        Pessoa p = new Pessoa("paulo", 4400.00, 0, 40);
        assertEquals(387.04, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 4400.00, 1, 30);
        assertEquals(207.33, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 4400.00, 2, 40);
        assertEquals(27.62, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 4400.00, 3, 20);
        assertEquals(0, p.calculaImposto(), 0);

        System.out.println("Passou Teste 4 - quarta faixa");
    }

    public static void testFaixa5() {
        Pessoa p = new Pessoa("jose", 7000.00, 0, 50);
        assertEquals(1098.85, p.calculaImposto(), 0.1);

        p = new Pessoa("jose", 7000.00, 2, 30);
        assertEquals(739.43, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 7000.00, 6, 40);
        assertEquals(20.59, p.calculaImposto(), 0.1);

        p = new Pessoa("paulo", 7000.00, 7, 20);
        assertEquals(0, p.calculaImposto(), 0);

        System.out.println("Passou Teste 5 - quinta faixa");
    }

    public static void testMaior65Faixa1() {
        Pessoa p = new Pessoa("Jose", 1500.00, 0, 65);
        assertEquals(0, p.calculaImposto(), 0);

        p = new Pessoa("Jose", 1500.00, 2, 70);
        assertEquals(0, p.calculaImposto(), 0);
    }

    public static void testMaior65Faixa2() {
        Pessoa p = new Pessoa("Jose", 2000.00, 0, 65);
        assertEquals(0, p.calculaImposto(), 0);

        p = new Pessoa("Jose", 2000.00, 2, 70);
        assertEquals(0, p.calculaImposto(), 0);
    }

    public static void testMaior65Faixa3() {
        Pessoa p = new Pessoa("Jose", 3500.00, 0, 65);
        assertEquals(0, p.calculaImposto(), 0);

        p = new Pessoa("Jose", 3500.00, 2, 70);
        assertEquals(0, p.calculaImposto(), 0);
    }

    public static void testMaior65Faixa4() {
        Pessoa p = new Pessoa("Jose", 4400.00, 0, 65);
        assertEquals(0, p.calculaImposto(), 0);

        p = new Pessoa("Jose", 4400.00, 2, 70);
        assertEquals(0, p.calculaImposto(), 0);
    }

    public static void testMaior65Faixa5() {
        Pessoa p = new Pessoa("Jose", 7000.00, 0, 65);
        assertEquals(0, p.calculaImposto(), 0);

        p = new Pessoa("Jose", 7000.00, 2, 70);
        assertEquals(0, p.calculaImposto(), 0);
    }

    private static void assertEquals(double esperado, double obtido, double margem) {
        if (Math.abs(esperado - obtido) > margem) {
            throw new AssertionError(
                    "Esperado: " + esperado + ", obtido: " + obtido);
        }
    }
}
