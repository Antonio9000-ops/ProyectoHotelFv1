package Modelo;
import java.util.ArrayList;
import java.util.List;
//solo prueba
// Definición de la clase Hotel
public class Hotel {
    // Atributos de la clase Hotel
    private String nombre;
    private String direccion;
    private int estrellas;
    
    // Relación de composición con la clase Habitacion
    private List<Habitacion> habitaciones;

    // Relación de composición con la clase Restaurante
    private RestauranteBarTienda restaurante;

    // Relación de agregación con la clase Servicio
    private List<Servicio> servicios;

    // Relación de agregación con la clase Evento
    private List<Evento> eventos;

    // Constructor de la clase Hotel
    public Hotel(String nombre, String direccion, int estrellas, RestauranteBarTienda restaurante) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.habitaciones = new ArrayList<>();
        this.restaurante = restaurante;
        this.servicios = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    // Métodos de la clase Hotel

    // Método para agregar una habitación al hotel
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    // Método para eliminar una habitación del hotel
    public void eliminarHabitacion(Habitacion habitacion) {
        habitaciones.remove(habitacion);
    }

    // Método para obtener la lista de habitaciones del hotel
    public List<Habitacion> obtenerHabitaciones() {
        return habitaciones;
    }

    // Método para agregar un servicio al hotel
    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    // Método para eliminar un servicio del hotel
    public void eliminarServicio(Servicio servicio) {
        servicios.remove(servicio);
    }

    // Método para obtener la lista de servicios del hotel
    public List<Servicio> obtenerServicios() {
        return servicios;
    }

    // Método para agregar un evento al hotel
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Método para eliminar un evento del hotel
    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
    }

    // Método para obtener la lista de eventos del hotel
    public List<Evento> obtenerEventos() {
        return eventos;
    }

    // Getters y setters para los atributos del hotel

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo direccion
    public String getDireccion() {
        return direccion;
    }

    // Setter para el atributo direccion
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter para el atributo estrellas
    public int getEstrellas() {
        return estrellas;
    }

    // Setter para el atributo estrellas
    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    // Getter para el atributo restaurante
    public RestauranteBarTienda getRestaurante() {
        return restaurante;
    }

    // Setter para el atributo restaurante
    public void setRestaurante(RestauranteBarTienda restaurante) {
        this.restaurante = restaurante;
    }

    
}

