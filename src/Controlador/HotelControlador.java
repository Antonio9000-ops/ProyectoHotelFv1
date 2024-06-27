package Controlador;

import Modelo.Hotel;
import Modelo.Habitacion;
import Modelo.Servicio;
import Modelo.Evento;
import Modelo.RestauranteBarTienda;

import java.util.List;

// Definición de la clase HotelControlador
public class HotelControlador {
    private Hotel hotelModelo; // Modelo Hotel para interactuar con los datos

    // Constructor de la clase HotelControlador
    public HotelControlador(Hotel hotelModelo) {
        this.hotelModelo = hotelModelo; // Inicializa el modelo Hotel
    }

    // Método para agregar una habitación al hotel
    public void agregarHabitacion(Habitacion habitacion) {
        hotelModelo.agregarHabitacion(habitacion); // Agrega una habitación usando el método del modelo
    }

    // Método para eliminar una habitación del hotel
    public void eliminarHabitacion(Habitacion habitacion) {
        hotelModelo.eliminarHabitacion(habitacion); // Elimina una habitación usando el método del modelo
    }

    // Método para obtener la lista de habitaciones del hotel
    public List<Habitacion> obtenerHabitaciones() {
        return hotelModelo.obtenerHabitaciones(); // Devuelve la lista de habitaciones desde el modelo
    }

    // Método para agregar un servicio al hotel
    public void agregarServicio(Servicio servicio) {
        hotelModelo.agregarServicio(servicio); // Agrega un servicio usando el método del modelo
    }

    // Método para eliminar un servicio del hotel
    public void eliminarServicio(Servicio servicio) {
        hotelModelo.eliminarServicio(servicio); // Elimina un servicio usando el método del modelo
    }

    // Método para obtener la lista de servicios del hotel
    public List<Servicio> obtenerServicios() {
        return hotelModelo.obtenerServicios(); // Devuelve la lista de servicios desde el modelo
    }

    // Método para agregar un evento al hotel
    public void agregarEvento(Evento evento) {
        hotelModelo.agregarEvento(evento); // Agrega un evento usando el método del modelo
    }

    // Método para eliminar un evento del hotel
    public void eliminarEvento(Evento evento) {
        hotelModelo.eliminarEvento(evento); // Elimina un evento usando el método del modelo
    }

    // Método para obtener la lista de eventos del hotel
    public List<Evento> obtenerEventos() {
        return hotelModelo.obtenerEventos(); // Devuelve la lista de eventos desde el modelo
    }

    // Getters y setters para los atributos del hotel

    // Getter para el atributo nombre
    public String getNombre() {
        return hotelModelo.getNombre(); // Devuelve el nombre del hotel desde el modelo
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        hotelModelo.setNombre(nombre); // Establece el nombre del hotel en el modelo
    }

    // Getter para el atributo direccion
    public String getDireccion() {
        return hotelModelo.getDireccion(); // Devuelve la dirección del hotel desde el modelo
    }

    // Setter para el atributo direccion
    public void setDireccion(String direccion) {
        hotelModelo.setDireccion(direccion); // Establece la dirección del hotel en el modelo
    }

    // Getter para el atributo estrellas
    public int getEstrellas() {
        return hotelModelo.getEstrellas(); // Devuelve las estrellas del hotel desde el modelo
    }

    // Setter para el atributo estrellas
    public void setEstrellas(int estrellas) {
        hotelModelo.setEstrellas(estrellas); // Establece las estrellas del hotel en el modelo
    }

    // Getter para el atributo restaurante
    public RestauranteBarTienda getRestaurante() {
        return hotelModelo.getRestaurante(); // Devuelve el restaurante del hotel desde el modelo
    }

    // Setter para el atributo restaurante
    public void setRestaurante(RestauranteBarTienda restaurante) {
        hotelModelo.setRestaurante(restaurante); // Establece el restaurante del hotel en el modelo
    }
}
