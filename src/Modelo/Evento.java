/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private String descripcion;
    private List<String> whatsapp;

    public Evento(String nombre, String fecha, String lugar, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.whatsapp = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(List<String> whatsapp) {
        this.whatsapp = whatsapp;
    }

    // Método link
    public void link(String whatsapp) {
        
        this.whatsapp.add(whatsapp);
        System.out.println("Número de WhatsApp agregado: " + whatsapp);
    }

    // Método obtenerEventos
    public List<Evento> obtenerEventos() {
      
        List<Evento> eventos = new ArrayList<>();
        // Se agregarían eventos a la lista 'eventos' desde la base de datos
        System.out.println("Obteniendo lista de eventos.");
        return eventos;
    }
}

