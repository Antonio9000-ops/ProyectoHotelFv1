/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.Date;

public class ReservaServicio {
    private Date fechaReserva;
    private String nombreServicio;
    private double costo;
    private Cliente cliente;

   
    public ReservaServicio(Date fechaReserva, String nombreServicio, double costo, Cliente cliente) {
        this.fechaReserva = fechaReserva;
        this.nombreServicio = nombreServicio;
        this.costo = costo;
        this.cliente = cliente;
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
}

