package Controlador;

import Modelo.Cliente;
import Modelo.ReservaServicio;
import java.util.Date;

// Definición de la clase ReservaServicioControlador
public class ReservaServicioControlador {
    private ReservaServicio reservaServicioModelo; 

    // Constructor de la clase ReservaServicioControlador
    public ReservaServicioControlador(ReservaServicio reservaServicioModelo) {
        this.reservaServicioModelo = reservaServicioModelo; // Inicializa el modelo ReservaServicio
    }

    // Métodos para interactuar con el modelo ReservaServicio

    // Método para confirmar la reserva
    public void confirmarReserva() {
        reservaServicioModelo.confirmarReserva(); // Llama al método confirmarReserva del modelo
    }

    // Método para calcular el costo de la reserva
    public double calcularCosto() {
        return reservaServicioModelo.calcularCosto(); // Llama al método calcularCosto del modelo
    }

    // Getters y setters para los atributos de la clase ReservaServicio

    public Date getFechaReserva() {
        return reservaServicioModelo.getFechaReserva();
    }

    public void setFechaReserva(Date fechaReserva) {
        reservaServicioModelo.setFechaReserva(fechaReserva);
    }

    public String getNombreServicio() {
        return reservaServicioModelo.getNombreServicio();
    }

    public void setNombreServicio(String nombreServicio) {
        reservaServicioModelo.setNombreServicio(nombreServicio);
    }

    public double getCosto() {
        return reservaServicioModelo.getCosto();
    }

    public void setCosto(double costo) {
        reservaServicioModelo.setCosto(costo);
    }

    public Cliente getCliente() {
        return reservaServicioModelo.getCliente();
    }

    public void setCliente(Cliente cliente) {
        reservaServicioModelo.setCliente(cliente);
    }

    public String getEstado() {
        return reservaServicioModelo.getEstado();
    }

    public void setEstado(String estado) {
        reservaServicioModelo.setEstado(estado);
    }
}
