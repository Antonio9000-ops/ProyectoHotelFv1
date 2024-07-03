package Controlador;

import Modelo.Habitacion;
import Modelo.Hotel;
import java.util.List;

// Definición de la clase HabitacionControlador
public class HabitacionControlador {
    private Habitacion habitacionModelo; // Modelo Habitacion para interactuar con los datos

    // Constructor de la clase HabitacionControlador
    public HabitacionControlador(Habitacion habitacionModelo) {
        this.habitacionModelo = habitacionModelo; // Inicializa el modelo Habitacion
    }

    // Método para actualizar el estado de la habitación
    public void actualizarEstado(String nuevoEstado) {
        habitacionModelo.actualizarEstado(nuevoEstado); // Actualiza el estado de la habitación usando el método del modelo
    }

    // Método para obtener los detalles de la habitación
    public String obtenerDetalles() {
        return habitacionModelo.obtenerDetalles(); // Devuelve los detalles de la habitación desde el modelo
    }

    // Getters y setters para los atributos de la habitación

    public int getNumero() {
        return habitacionModelo.getNumero(); // Devuelve el número de la habitación desde el modelo
    }

    public void setNumero(int numero) {
        habitacionModelo.setNumero(numero); // Establece el número de la habitación en el modelo
    }

    public String getTipo() {
        return habitacionModelo.getTipo(); // Devuelve el tipo de la habitación desde el modelo
    }

    public void setTipo(String tipo) {
        habitacionModelo.setTipo(tipo); // Establece el tipo de la habitación en el modelo
    }

    public double getPrecio() {
        return habitacionModelo.getPrecio(); // Devuelve el precio de la habitación desde el modelo
    }

    public void setPrecio(double precio) {
        habitacionModelo.setPrecio(precio); // Establece el precio de la habitación en el modelo
    }

    public String getEstado() {
        return habitacionModelo.getEstado(); // Devuelve el estado de la habitación desde el modelo
    }

    public void setEstado(String estado) {
        habitacionModelo.setEstado(estado); // Establece el estado de la habitación en el modelo
    }

    public Hotel getHotel() {
        return habitacionModelo.getHotel(); // Devuelve el hotel asociado desde el modelo
    }

    public void setHotel(Hotel hotel) {
        habitacionModelo.setHotel(hotel); // Establece el hotel asociado en el modelo
    }
}
