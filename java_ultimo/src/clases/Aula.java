import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aula implements Serializable {
    private int numero;
    private int capacidad;
    private List<Reserva> reservas;

    public Aula(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.reservas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }
}
