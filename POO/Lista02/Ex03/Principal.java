public class Principal {
    public static void main(String[] args) {
        TV tv = new TV(7, 15);
        ControleRemoto controle = new ControleRemoto(tv);

        controle.mostrarEstado();
        controle.trocarCanal(12);
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
    }
}

class TV {
    private int canal;
    private int volume;

    public TV(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void setCanal(int canal) {
        if (canal > 0) {
            this.canal = canal;
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public String toString() {
        return "TV ligada no canal " + canal + " com volume " + volume;
    }
}

class ControleRemoto {
    private TV tv;

    public ControleRemoto(TV tv) {
        this.tv = tv;
    }

    public void mostrarEstado() {
        System.out.println(tv);
    }

    public void trocarCanal(int novoCanal) {
        tv.setCanal(novoCanal);
        System.out.println("Canal alterado:");
        mostrarEstado();
    }

    public void aumentarVolume() {
        tv.aumentarVolume();
        System.out.println("Volume aumentado:");
        mostrarEstado();
    }

    public void diminuirVolume() {
        tv.diminuirVolume();
        System.out.println("Volume diminuido:");
        mostrarEstado();
    }
}
