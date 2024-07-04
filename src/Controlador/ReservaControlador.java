package Controlador;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Pago;
import Modelo.Reserva;
import java.util.Date;
import java.util.List;

// Definición de la clase ReservaControlador
public class ReservaControlador {
    private Reserva reservaModelo; // Modelo Reserva para interactuar con los datos

    // Constructor de la clase ReservaControlador
    public ReservaControlador(Reserva reservaModelo) {
        this.reservaModelo = reservaModelo; // Inicializa el modelo Reserva
    }

    // Métodos para interactuar con el modelo Reserva

    // Método para crear una reserva
    public void crearReserva() {
        reservaModelo.crearReserva(); 
    }

    // Método para cancelar una reserva
    public void cancelarReserva() {
        reservaModelo.cancelarReserva(); 
    }

    // Método para obtener la lista de reservas
    public List<Reserva> obtenerReservas(List<Reserva> reservas) {
        return Reserva.obtenerReservas(reservas); 
    }

    // Métodos adicionales para la relación con pagos
    public void agregarPago(Pago pago) {
        reservaModelo.agregarPago(pago); 
    }

    public List<Pago> obtenerPagos() {
        return reservaModelo.obtenerPagos(); 
    }

    // Getters y setters para los atributos de la clase Reserva

    public Date getFechaInicio() {
        return reservaModelo.getFechaInicio();
    }

    public void setFechaInicio(Date fechaInicio) {
        reservaModelo.setFechaInicio(fechaInicio);
    }

    public Date getFechaFin() {
        return reservaModelo.getFechaFin();
    }

    public void setFechaFin(Date fechaFin) {
        reservaModelo.setFechaFin(fechaFin);
    }

    public int getNumeroDeHabitacion() {
        return reservaModelo.getNumeroDeHabitacion();
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        reservaModelo.setNumeroDeHabitacion(numeroDeHabitacion);
    }

    public String getEstado() {
        return reservaModelo.getEstado();
    }

    public void setEstado(String estado) {
        reservaModelo.setEstado(estado);
    }

    public Cliente getCliente() {
        return reservaModelo.getCliente();
    }

    public void setCliente(Cliente cliente) {
        reservaModelo.setCliente(cliente);
    }

    public Empleado getEmpleado() {
        return reservaModelo.getEmpleado();
    }

    public void setEmpleado(Empleado empleado) {
        reservaModelo.setEmpleado(empleado);
    }
}
