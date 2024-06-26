package Controlador;

import Modelo.Espacio;

// Definición de la clase EspacioControlador
public class EspacioControlador {
    private Espacio espacioModelo; // Modelo Espacio para interactuar con los datos

    // Constructor de la clase EspacioControlador
    public EspacioControlador(Espacio espacioModelo) {
        this.espacioModelo = espacioModelo; // Inicializa el modelo Espacio
    }

    // Método para obtener el ID del espacio
    public String getId() {
        return espacioModelo.getId(); // Devuelve el ID del espacio desde el modelo
    }

    // Método para establecer el ID del espacio
    public void setId(String id) {
        espacioModelo.setId(id); // Establece el ID del espacio en el modelo
    }

    // Método para verificar si el espacio está disponible
    public boolean isDisponible() {
        return espacioModelo.isDisponible(); // Devuelve la disponibilidad del espacio desde el modelo
    }

    // Método para establecer la disponibilidad del espacio
    public void setDisponible(boolean disponible) {
        espacioModelo.setDisponible(disponible); // Establece la disponibilidad del espacio en el modelo
    }
}
