
package Modelo;

import java.util.ArrayList;
import java.util.List;


public class Estacionamiento {
    private int numeroEspacios;
    private double tarifaPorHora;
    private List<Espacio> espacios;

    public int getNumeroEspacios() {
        return numeroEspacios;
    }

    public void setNumeroEspacios(int numeroEspacios) {
        this.numeroEspacios = numeroEspacios;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public List<Espacio> getEspacios() {
        return espacios;
    }

    public void setEspacios(List<Espacio> espacios) {
        this.espacios = espacios;
    }

    public Estacionamiento(int numeroEspacios, double tarifaPorHora, List<Espacio> espacios) {
        this.numeroEspacios = numeroEspacios;
        this.tarifaPorHora = tarifaPorHora;
        this.espacios = espacios;
    }
    // Método obtenerEspaciosDisponibles
    public List<Espacio> obtenerEspaciosDisponibles() {
        // Lógica para obtener espacios disponibles
        List<Espacio> disponibles = new ArrayList<>();
        for (Espacio espacio : espacios) {
            if (espacio.isDisponible()) {
                disponibles.add(espacio);
            }
        }
        return disponibles;
    }
}