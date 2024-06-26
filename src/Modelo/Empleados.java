/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;

public class Empleados {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String puesto;

    public Empleados(String nombre, String apellido, String email, String telefono, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    public void registrarCliente(Cliente cliente) {
        
        System.out.println("Registrando cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        
    }

    
    public void gestionarReservas(Reserva reserva) {
        
        System.out.println("Gestionando reserva para el cliente: " + reserva.getCliente().getNombre());
        
    }

    
    public void historialCliente(Cliente cliente) {
        
        System.out.println("Obteniendo historial del cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        
    }
}

