package Modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

// Definición de la clase Admin
public class Admin {
    // Atributos de la clase Admin
    private List<Reserva> reservas;
    private List<Solicitud> solicitudes;

    // Constructor de la clase Admin
    public Admin() {
        this.reservas = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
    }

    // Métodos de la clase Admin

    // Método para hacer una nueva reserva
    public void hacerNuevaReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Método para hacer una nueva solicitud
    public void hacerNuevaSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }

    // Método para ver las reservas confirmadas
    public List<Reserva> verReservasConfirmadas() {
        List<Reserva> confirmadas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if ("confirmada".equals(reserva.getEstado())) {
                confirmadas.add(reserva);
            }
        }
        return confirmadas;
    }

    // Método para ver las solicitudes confirmadas
    public List<Solicitud> verSolicitudesConfirmadas() {
        List<Solicitud> confirmadas = new ArrayList<>();
        for (Solicitud solicitud : solicitudes) {
            if ("confirmada".equals(solicitud.getEstado())) {
                confirmadas.add(solicitud);
            }
        }
        return confirmadas;
    }

    // Método para ver el historial de reservas
    public List<Reserva> verHistorialReservas() {
        return new ArrayList<>(reservas);
    }

    // Método para ver el historial de solicitudes
    public List<Solicitud> verHistorialSolicitudes() {
        return new ArrayList<>(solicitudes);
    }

    // Relación con la clase Empleado
    public void gestionarReservasEmpleado(Empleado empleado, Reserva reserva) {
        empleado.gestionarReservas(reserva);
    }
}
