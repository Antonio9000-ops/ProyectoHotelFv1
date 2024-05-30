/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
import java.util.List;

public class Servicio {
    private String nombre;
    private String descripcion;
    private double costo;

    public Servicio(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Métodos adicionales
    public String obtenerDetalleServicio() {
        return "Nombre: " + nombre + ", Descripción: " + descripcion + ", Costo: " + costo;
    }

    public void reservarServicio(Cliente cliente) {
        // Implementación para reservar el servicio para un cliente específico
        // Por ejemplo, puedes agregar la lógica para registrar la reserva en una base de datos o lista.
        System.out.println("Servicio " + nombre + " reservado para el cliente: " + cliente.getNombre());
    }
}

