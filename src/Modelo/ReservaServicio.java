package Modelo;

import java.util.Date;

public class ReservaServicio {
    private Date fechaReserva;
    private String nombreServicio;
    private double costo;
    private Cliente cliente;
    private String estado; // nuevo atributo para almacenar el estado de la reserva

    public ReservaServicio(Date fechaReserva, String nombreServicio, double costo, Cliente cliente) {
        this.fechaReserva = fechaReserva;
        this.nombreServicio = nombreServicio;
        this.costo = costo;
        this.cliente = cliente;
        this.estado = "Pendiente"; // estado inicial
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Nuevo método para confirmar la reserva
    public void confirmarReserva() {
        this.estado = "Confirmado";
    }

    // Nuevo método para calcular el costo de la reserva
    public double calcularCosto() {
        return this.costo;
    }
}

