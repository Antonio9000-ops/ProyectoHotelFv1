package Controlador;

import Modelo.Evento;
import java.util.Date;

// Definición de la clase EventoControlador
public class EventoControlador {
    private Evento eventoModelo; // Modelo Evento para interactuar con los datos

    // Constructor de la clase EventoControlador
    public EventoControlador(Evento eventoModelo) {
        this.eventoModelo = eventoModelo; // Inicializa el modelo Evento
    }

    // Método para obtener el nombre del evento
    public String getNombre() {
        return eventoModelo.getNombre(); // Devuelve el nombre del evento desde el modelo
    }

    // Método para establecer el nombre del evento
    public void setNombre(String nombre) {
        eventoModelo.setNombre(nombre); // Establece el nombre del evento en el modelo
    }

    // Método para obtener la fecha del evento
    public Date getFecha() {
        return eventoModelo.getFecha(); // Devuelve la fecha del evento desde el modelo
    }

    // Método para establecer la fecha del evento
    public void setFecha(Date fecha) {
        eventoModelo.setFecha(fecha); // Establece la fecha del evento en el modelo
    }

    // Método para obtener el lugar del evento
    public String getLugar() {
        return eventoModelo.getLugar(); // Devuelve el lugar del evento desde el modelo
    }

    // Método para establecer el lugar del evento
    public void setLugar(String lugar) {
        eventoModelo.setLugar(lugar); // Establece el lugar del evento en el modelo
    }

    // Método para obtener la descripción del evento
    public String getDescripcion() {
        return eventoModelo.getDescripcion(); // Devuelve la descripción del evento desde el modelo
    }

    // Método para establecer la descripción del evento
    public void setDescripcion(String descripcion) {
        eventoModelo.setDescripcion(descripcion); // Establece la descripción del evento en el modelo
    }

    // Método para enlazar el evento con Whatsapp (simulado con un print)
    public void enlazarConWhatsapp(String whatsapp) {
        eventoModelo.Link(whatsapp); // Enlaza el evento con Whatsapp utilizando el método del modelo
    }
}
