import java.io.Serializable;

public class Horario implements Serializable {

    private int hora;
    private int minuto;
    private Cliente cliente;

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.cliente = null;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean disponivel() {
        return cliente == null;
    }

    public void marcarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {

        String status;

        if(cliente == null){
            status = "Disponível";
        }
        else{
            status = cliente.getNome();
        }

        return String.format("%02d:%02d - %s",
                hora,minuto,status);
    }

}