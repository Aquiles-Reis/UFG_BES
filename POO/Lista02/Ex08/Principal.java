public class Principal {
    public static void main(String[] args) {
        Horario horario1 = new Horario(10, 25, 30);
        Horario horario2 = new Horario(14, 10, 5);

        System.out.println("Horario 1: " + horario1);
        System.out.println("Horario 2: " + horario2);
        System.out.println("Segundos do horario 1: " + horario1.emSegundos());
        System.out.println("Segundos do horario 2: " + horario2.emSegundos());
        System.out.println("Diferenca em segundos: " + horario1.diferencaEmSegundos(horario2));
        System.out.println("Horario mais cedo: " + Horario.maisCedo(horario1, horario2));
    }
}

class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        this.hora = (hora >= 0 && hora <= 23) ? hora : 0;
    }

    public void setMinuto(int minuto) {
        this.minuto = (minuto >= 0 && minuto <= 59) ? minuto : 0;
    }

    public void setSegundo(int segundo) {
        this.segundo = (segundo >= 0 && segundo <= 59) ? segundo : 0;
    }

    public int emSegundos() {
        return (hora * 3600) + (minuto * 60) + segundo;
    }

    public int diferencaEmSegundos(Horario outro) {
        return Math.abs(emSegundos() - outro.emSegundos());
    }

    public static Horario maisCedo(Horario horario1, Horario horario2) {
        return horario1.emSegundos() <= horario2.emSegundos() ? horario1 : horario2;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
