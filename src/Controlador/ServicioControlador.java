package Controlador;

import Modelo.Cliente;
import Modelo.Servicio;

// Definición de la clase ServicioControlador
public class ServicioControlador {
    private Servicio servicioModelo; // Modelo Servicio 

    // Constructor de la clase ServicioControlador
    public ServicioControlador(Servicio servicioModelo) {
        this.servicioModelo = servicioModelo; // Inicializa el modelo Servicio
    }

    // Método para obtener el detalle del servicio
    public String obtenerDetalleServicio() {
        return servicioModelo.obtenerDetalleServicio();
    }

    // Método para reservar el servicio para un cliente específico
    public void reservarServicio(Cliente cliente) {
        servicioModelo.reservarServicio(cliente);
    }

    // Getters y setters para los atributos del servicio

    public String getNombre() {
        return servicioModelo.getNombre();
    }

    public void setNombre(String nombre) {
        servicioModelo.setNombre(nombre);
    }

    public String getDescripcion() {
        return servicioModelo.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        servicioModelo.setDescripcion(descripcion);
    }

    public double getCosto() {
        return servicioModelo.getCosto();
    }

    public void setCosto(double costo) {
        servicioModelo.setCosto(costo);
    }
}
