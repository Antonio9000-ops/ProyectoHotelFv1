package Modelo;
import java.util.Date;

// Definición de la clase Habitacion
public class Habitacion {
    // Atributos de la clase Habitacion
    private int numero;
    private String tipo;
    private double precio;
    private String estado;
    private Hotel hotel;

    // Constructor de la clase Habitacion
    public Habitacion(int numero, String tipo, double precio, String estado, Hotel hotel) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
        this.hotel = hotel;
    }

    // Métodos de la clase Habitacion

    // Método para actualizar el estado de la habitación
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Método para obtener los detalles de la habitación
    public String obtenerDetalles() {
        return "Numero: " + numero + ", Tipo: " + tipo + ", Precio: " + precio + ", Estado: " + estado;
    }

    // Getters y setters para los atributos de la habitación

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
