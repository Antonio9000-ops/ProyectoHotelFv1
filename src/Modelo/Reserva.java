/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.Date;
import java.util.List;

public class Reserva extends Cliente {
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroDeHabitacion;
    private String estado;
    private Cliente cliente;

    public Reserva(String nombre, String apellido, String email, String telefono, String direccion, Login login) {
        super(nombre, apellido, email, telefono, direccion, login);
    }

    public Reserva(Date fechaInicio, Date fechaFin, int numeroDeHabitacion, String estado, Cliente cliente, String nombre, String apellido, String email, String telefono, String direccion, Login login) {
        super(nombre, apellido, email, telefono, direccion, login);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.estado = estado;
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos adicionales
    public void crearReserva() {
        // Implementación para crear una nueva reserva
        System.out.println("Reserva creada para el cliente: " + cliente.getNombre());
    }

    public void cancelarReserva() {
        // Implementación para cancelar una reserva
        this.estado = "Cancelada";
        System.out.println("Reserva cancelada para el cliente: " + cliente.getNombre());
    }

    public List<Reserva> obtenerReservas() {
        // Implementación para obtener todas las reservas
        // Aquí se debe retornar una lista de todas las reservas (esto es solo un ejemplo)
        return null;
    }
}


