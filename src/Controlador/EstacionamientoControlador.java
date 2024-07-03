package Controlador;

import Modelo.Espacio;
import Modelo.Estacionamiento;
import java.util.List;

// Definición de la clase EstacionamientoControlador
public class EstacionamientoControlador {
    private Estacionamiento estacionamientoModelo; // Modelo Estacionamiento para interactuar con los datos

    // Constructor de la clase EstacionamientoControlador
    public EstacionamientoControlador(Estacionamiento estacionamientoModelo) {
        this.estacionamientoModelo = estacionamientoModelo; // Inicializa el modelo Estacionamiento
    }

    // Método para obtener el número de espacios
    public int getNumeroEspacios() {
        return estacionamientoModelo.getNumeroEspacios(); // Devuelve el número de espacios desde el modelo
    }

    // Método para establecer el número de espacios
    public void setNumeroEspacios(int numeroEspacios) {
        estacionamientoModelo.setNumeroEspacios(numeroEspacios); // Establece el número de espacios en el modelo
    }

    // Método para obtener la tarifa por hora
    public double getTarifaPorHora() {
        return estacionamientoModelo.getTarifaPorHora(); // Devuelve la tarifa por hora desde el modelo
    }

    // Método para establecer la tarifa por hora
    public void setTarifaPorHora(double tarifaPorHora) {
        estacionamientoModelo.setTarifaPorHora(tarifaPorHora); // Establece la tarifa por hora en el modelo
    }

    // Método para obtener la lista de espacios
    public List<Espacio> getEspacios() {
        return estacionamientoModelo.getEspacios(); // Devuelve la lista de espacios desde el modelo
    }

    // Método para establecer la lista de espacios
    public void setEspacios(List<Espacio> espacios) {
        estacionamientoModelo.setEspacios(espacios); // Establece la lista de espacios en el modelo
    }

    // Método para obtener espacios disponibles
    public List<Espacio> obtenerEspaciosDisponibles() {
        return estacionamientoModelo.obtenerEspaciosDisponibles(); // Devuelve la lista de espacios disponibles desde el modelo
    }
}
