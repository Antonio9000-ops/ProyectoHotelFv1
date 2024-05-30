/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;
import java.util.List;

public class Pago {
    private Date fecha;
    private double montoTotal;
    private String metodoPago;
    private Cliente cliente;
    private List<Servicio> servicios;
    private List<Platillo> platillos;
    private List<Reserva> reservasHabitacion;
    private List<ReservaServicio> reservasServicio;

    // Constructor
    public Pago(Date fecha, double montoTotal, String metodoPago, Cliente cliente) {
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
        this.cliente = cliente;
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
    }

    public List<Reserva> getReservasHabitacion() {
        return reservasHabitacion;
    }

    public void setReservasHabitacion(List<Reserva> reservasHabitacion) {
        this.reservasHabitacion = reservasHabitacion;
    }

    public List<ReservaServicio> getReservasServicio() {
        return reservasServicio;
    }

    public void setReservasServicio(List<ReservaServicio> reservasServicio) {
        this.reservasServicio = reservasServicio;
    }

    // Métodos adicionales
    public void agregarDetalleServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void agregarDetalleConsumo(Platillo platillo) {
        this.platillos.add(platillo);
    }

    public void agregarDetalleReservaHabitacion(Reserva reservaHabitacion) {
        this.reservasHabitacion.add(reservaHabitacion);
    }

    public void agregarDetalleReservaServicio(ReservaServicio reservaServicio) {
        this.reservasServicio.add(reservaServicio);
    }
    }

