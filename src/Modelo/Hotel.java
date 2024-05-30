
package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private int estrellas;
    private List<Habitacion> habitaciones;
    private RestauranteBarTienda restaurante;
    private List<Servicio> servicios;
    private List<Evento> eventos;
    
   

   
    public Hotel(String nombre, String direccion, int estrellas, List<Habitacion> habitaciones, RestauranteBarTienda restaurante, List<Servicio> servicios, List<Evento> eventos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.habitaciones = new ArrayList<>(habitaciones);
        this.restaurante = restaurante;
        this.servicios = new ArrayList<>(servicios);
        this.eventos = new ArrayList<>(eventos);
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public RestauranteBarTienda getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(RestauranteBarTienda restaurante) {
        this.restaurante = restaurante;
    }

    public List<Servicio> getServicios() {
         int a=1;
        return servicios;
        
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    // Métodos
    public void agregarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(Habitacion habitacion) {
        this.habitaciones.remove(habitacion);
    }

    public List<Habitacion> obtenerHabitaciones() {
        return this.habitaciones;
    }

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void eliminarServicio(Servicio servicio) {
        this.servicios.remove(servicio);
    }

    public List<Servicio> obtenerServicios() {
        return this.servicios;
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public void eliminarEvento(Evento evento) {
        this.eventos.remove(evento);
    }

    public List<Evento> obtenerEventos() {
        return this.eventos;
    }
    
}

